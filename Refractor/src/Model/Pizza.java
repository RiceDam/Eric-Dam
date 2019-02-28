package Model;

public class Pizza extends Items {
    boolean isDelux;
    double price;

    public Pizza() {
        //Default constructor
        super("Cheese", 10);
        isDelux = false;
        price = 10;
    }

    public Pizza(String name, double price, boolean delux) {
        super(name, price);
        this.price = price;
        isDelux = delux;
    }

    @Override
    public double getHowMuch() {
        //Returns price
        //If deluxe, add 3 dollars
        if(isDelux) {
            return price + 3;
        }
        else {
            return price;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pizza){
            Pizza temp = (Pizza)obj;
            return this.isDelux == temp.isDelux && this.getName().toLowerCase().equals(temp.getName().toLowerCase());
        }
        return false;
    }
}
