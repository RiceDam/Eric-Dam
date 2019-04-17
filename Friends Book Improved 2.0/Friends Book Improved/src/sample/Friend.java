package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    String Fname;
    String Lname;
    Long phone;
    int age;


    Friend(String Fname, String Lname, Long phone, int age) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.phone = phone;
        this.age = age;
    }

    public void writeToFile(String fileName) throws IOException {
        //Method to write the list of friends to a file
        FileWriter fw = new FileWriter(fileName + ".txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Fname + " " + Lname +",\r");
        bw.write(phone+"\r");
        bw.write(age+"\r");
        bw.write(";\r");
        bw.close();
    }

    @Override
    public String toString() {
        return "Name: " + Fname + " " + Lname + " \tPhone number: " + phone + " \tAge: " + age;
    }
}
