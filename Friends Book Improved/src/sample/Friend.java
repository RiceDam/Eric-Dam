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

    public void writeToFile(String fileName) throws IOException {
        //Method to write the list of friends to a file
        FileWriter fw = new FileWriter(fileName + ".txt", true);
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
        if (this.name.toLowerCase().equals(f.name.toLowerCase())) {
            return true;
        }
        else{
            return false;
        }
    }
}
