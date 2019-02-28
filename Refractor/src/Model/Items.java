package Model;

public abstract class Items {
    private String name;
    private double howMuch;

    public Items() {
        name = " ";
        howMuch = 0.0;
    }

    public Items(String name, double howMuch) {
        this.name = name;
        this.howMuch = howMuch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getHowMuch();

    @Override
    public String toString() {
        return "Name: " + name + "\tPrice: " + howMuch;
    }


}
