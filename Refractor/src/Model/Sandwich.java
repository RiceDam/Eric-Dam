package Model;

public class Sandwich extends Items {
    public enum Size{
        //Sets a price for each size of sandwich
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){price = d;}
        double getPrice() {return price;}
    }

    Size size;

    public Sandwich() {
        //Default Constructor
        super("Hamburger", Size.MEDIUM.getPrice());
        size = Size.MEDIUM;
    }

    public Sandwich(String name, Size size){
        super(name,size.getPrice());
        this.size = size;
    }

    @Override
    public double getHowMuch() {
        //Returns price
        return size.getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Sandwich) {
            Sandwich temp = (Sandwich)obj;
            return this.size == temp.size && this.getName().toLowerCase().equals(temp.getName().toLowerCase());
        }
        return false;
    }
}
