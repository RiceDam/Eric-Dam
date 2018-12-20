package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    String name;
    String phone;
    public boolean f;

    Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void writeToFile() throws IOException {
        //Method to write the list of friends to a file
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
        //Compares if there are duplicates in the list
        if (this.name.equals(f.name)) {
            return true;
        }
        else{
            return false;
        }
    }
}
