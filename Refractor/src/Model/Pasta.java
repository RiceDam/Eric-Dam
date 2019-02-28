package Model;

public class Pasta extends Items {
    boolean isDelux;
    double price;

    public Pasta() {
        //Default constructor
        super("Pasta", 12);
        isDelux = false;
    }

    public Pasta(String name, double price, boolean isDelux){
        super(name, price);
        this.isDelux = isDelux;
        this.price = price;
    }

    @Override
    public double getHowMuch() {
        //Returns price
        //if delux add 2 bucks
        if(isDelux) {
            return price+2;
        }
        else {
            return price;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pasta) {
            Pasta temp = (Pasta)obj;
            return this.isDelux == temp.isDelux && this.getName().toLowerCase().equals(temp.getName().toLowerCase());
        }
        return false;
    }
}
