package sample;

public class Friend {
    public String name;
    public String phone;

    Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name;
    }
}
