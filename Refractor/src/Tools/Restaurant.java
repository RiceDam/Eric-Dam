package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import Tools.Time.Time;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Customer> cust = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Items> invent = new ArrayList<>();

    public Restaurant(String name){
        this.name = name;
        makeFood();
    }

    public void makeFood(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        //Creates more pizzas to add to inventory
        invent.add(new Pizza());
    }
    private void makePasta(){
        //Creates more pasta to add to inventory
        invent.add(new Pasta());
    }
    private void makeSandwich(){
        //Creates sandwiches to add to inventory
        invent.add(new Sandwich());
    }

    public void newOrder(Customer cus, Time start, Items... item) {
        //If a customer is going to make an order, adds it to order list
        ArrayList<Items> temp = new ArrayList<>();
        for(Items i: item) {
            temp.add(i);
        }
        Order o = new Order(cus,temp, start);
        orders.add(o);
        o.inStock(invent);
        cust.add(cus);
    }

    public void displayOrders() {
        //Displays all orders
        for(Order o: orders) {
            System.out.println(o);
        }
    }

    public void displayInventory() {
        //Displays items in inventory
        for (Items i: invent) {
            System.out.println(i);
        }
    }

    public void displayCustomers() {
        //Display list of customers
        for(Customer c: cust) {
            System.out.println(c);
        }
    }
}
