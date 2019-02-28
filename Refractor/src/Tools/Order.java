package Tools;

import Model.Items;
import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Second;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Items> cusOrder;
    Time start;
    Time end;
    Hour startHr = new Hour(0);
    Minute startMin = new Minute(0);
    Second startSec = new Second(0);
    boolean out;
    boolean complete;
    Customer cus;

    public Order(Customer cus, ArrayList<Items> items, Time start){
        this.cus = cus;
        startHr.setX(start.getHr().getX());
        startMin.setY(start.getMin().getY());
        startSec.setZ(start.getSec().getZ());
        cusOrder = items;
        this.start = new Time(startHr,startMin,startSec);
        end = new Time(start);
        for(int i = 0; i < 20; i++) {
            end.tick();
        }
        out = false;
        complete = false;
    }

    protected boolean inStock(ArrayList<Items> item) {
        //Check if order items are in inventory
        ArrayList<Boolean> temp = new ArrayList<>();
        for(Items i : cusOrder) {
            for(Items j : item){
                if(i.equals(j)) {
                    temp.add(true);
                    break;
                }
            }
        }
        //if not in inventory add 10 minutes to order
        if (temp.size() < cusOrder.size()) {
            for(int i = 0; i < 600; i++) {
                end.tick();
            }
            deliveryInProgress();
            delivered();
            return false;
        }
        else {
            deliveryInProgress();
            delivered();
            return true;
        }
    }

    private void deliveryInProgress(){
        out = true;
    }
    private void delivered(){
        complete = true;
    }
    public double getTotalPrice(){
        //Returns total price for the order
        double price = 0;
        for(Items i: cusOrder) {
            price += i.getHowMuch();
        }
        return price;
    }

    public String toString() {
        return cus + "\tOrder: " + cusOrder + "\tTotal Cost: $" + getTotalPrice() + "\tStart time: " + start + "\tEnd time: " + end;
    }
}
