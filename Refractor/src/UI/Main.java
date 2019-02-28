package UI;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import Tools.Customer;
import Tools.Restaurant;
import Tools.Time.Hour;
import Tools.Time.Minute;
import Tools.Time.Second;
import Tools.Time.Time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Try sample orders
        //Testing 2 separate orders
        Time t = new Time(new Hour(1),new Minute(3), new Second(5));
        Time h = new Time();
        //For first order
        Sandwich ham = new Sandwich("ham", Sandwich.Size.LARGE);
        Pasta spa = new Pasta("spaghetti", 12.5, true);
        //Second order
        Sandwich burger = new Sandwich();
        Pasta pasta = new Pasta();
        Restaurant ericRes = new Restaurant("Eric's Restaurant");
        Customer cus = new Customer("Eric", "3213 Something St");
        ericRes.newOrder(cus,h,spa,ham);
        ericRes.newOrder(new Customer("Bob", "2432 East 21st Ave"), t, burger, pasta);
        ericRes.displayOrders();
    }
}
