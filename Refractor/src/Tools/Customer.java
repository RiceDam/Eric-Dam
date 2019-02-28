package Tools;

public class Customer {
    //Customer info class
    String name;
    String address;

    public Customer() {
        name = "John Doe";
        address = "4321 Famous Street";
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + "\tAddress: " + address;
    }
}
