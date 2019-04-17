package sample;

import javafx.collections.ObservableList;

import java.io.File;

public class MyExceptions extends Throwable{
    long phone = 1000000000L;
    int age = 0;
    String name = "";
    String fileName = "";
    int listSize = 1;

    MyExceptions(long p) {
        phone = p;
    }
    MyExceptions(String n, int type) {
        if(type == 0) {
            name = n;
        }
        if(type == 1){
            fileName = n;
        }
    }
    MyExceptions(int a, int type) {
        if(type == 0) {
            age = a;
        }
        if(type == 1) {
          listSize = a;
        }
    }


    public String toString() {
        for(Character c: name.toCharArray()) {
            if(Character.isDigit(c) || !name.contains(" ")) {
                return(name + " is not a valid name");
            }
        }
        if (phone < 1000000000L || phone > 9999999999L) {
            return(phone + " is not a valid phone number");
        }
        if (age < 0 || age > 200) {
            return(age + " is not a valid age");
        }
        if(listSize == 0) {
            return("Please insert items into the list to save");
        }
        if(fileName.length() == 0 || !new File(fileName + ".txt").exists()) {
            return("Please type in a file name to save or correct file name to load files");
        }
        return null;
    }
}
