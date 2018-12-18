package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    String name;
    String phone;

    Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name +",\r");
        bw.write(phone+"\r");
        bw.write(";\r");
        bw.close();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tPhone number: " + phone;
    }

    public boolean compareFriends(Friend f) {
        if (this.name.equals(f.name)) {
            return true;
        }
        else return false;
    }
}
