package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Controller {
    public TextField getName;
    public TextField getPhone;
    public ListView listFriends;
    public TextField fileName;
    public TextField getAge;

    static void nameCheck(String n) throws MyExceptions {
        Boolean contains = false;
        for(Character c: n.toCharArray()) {
            if(c == ' ') {
                contains = true;
            }
            if(Character.isDigit(c)) {
                throw new MyExceptions(n,0);
            }
        }
        if(!contains) {
            throw new MyExceptions(n,0);
        }
    }
    static void phoneCheck(Long l) throws MyExceptions {
        if(l < 1000000000L || l > 9999999999L) {
            throw new MyExceptions(l);
        }
    }
    static void ageCheck(Integer i) throws MyExceptions {
        if(i < 0 || i > 200) {
            throw new MyExceptions(i,0);
        }
    }
    static void fileNameCheck(String n) throws MyExceptions {
        if(n.length() == 0) {
            throw new MyExceptions(n, 1);
        }
    }
    static void fileNameExistsCheck(String n) throws MyExceptions {
        if(!new File(n + ".txt").exists()) {
            throw new MyExceptions(n,1);
        }
    }
    static void listSizeCheck(Integer i) throws MyExceptions {
        if(i == 0) {
            throw new MyExceptions(i,1);
        }
    }
    public void createFriend(ActionEvent actionEvent) {
        //Adds the friend to the list on the program window
        try {
            String Fname = "";
            String Lname = "";
            nameCheck(getName.getText());
            phoneCheck(Long.parseLong(getPhone.getText()));
            ageCheck(Integer.parseInt(getAge.getText()));
            for(int i= 0; i<getName.getText().length();i++) {
                if(getName.getText().charAt(i) == ' ') {
                    Fname = getName.getText().substring(0,i);
                    Lname = getName.getText().substring(i+1);
                }
            }
            Friend f = new Friend(Fname, Lname, Long.parseLong(getPhone.getText()), Integer.parseInt(getAge.getText()));
            listFriends.getItems().add(f);
            getName.clear();
            getPhone.clear();
            getAge.clear();
        }
        catch(NumberFormatException e) {
            System.out.println("Please enter a number");
        }
        catch (MyExceptions e) {
            System.out.println(e);
        }
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        // Saves list of friends to a text file
        File friFile = new File(fileName.getText() + ".txt");
        if(!friFile.exists()) {
            try {
                fileNameCheck(fileName.getText());
                ObservableList<Friend> myList = listFriends.getItems();
                for (Friend f : myList) {
                    f.writeToFile(fileName.getText());
                }
                fileName.clear();
                listFriends.getItems().clear();
            } catch (MyExceptions e) {
                System.out.println(e);
            }
        }
        else {
            try {
                Boolean nameExists = false;
                fileNameCheck(fileName.getText() + ".txt");
                listSizeCheck(listFriends.getItems().size());
                ObservableList<Friend> myList = listFriends.getItems();
                ArrayList<Friend> friends = CreateFriend.createAllFriends(fileName.getText());
                for(Friend f: myList) {
                    nameExists = false;
                    for(Friend k: friends) {
                        if ((k.Fname + " " + k.Lname).equals(f.Fname + " " + f.Lname)) {
                            nameExists = true;
                        }
                    }
                    if(!nameExists) {
                        f.writeToFile(fileName.getText());
                    }
                    else {
                        System.out.println(f.Fname + " " + f.Lname + " already exists in the list so it was not added");
                    }
                }
                friends.clear();
                fileName.clear();
                listFriends.getItems().clear();
            }
            catch (MyExceptions e) {
                System.out.println(e);
            }

        }
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException{
        //Loads the list of friends
        try {
            listFriends.getItems().clear();
            fileNameCheck(fileName.getText());
            fileNameExistsCheck(fileName.getText());
            ArrayList<Friend> friends = CreateFriend.createAllFriends(fileName.getText());
            for (Friend f : friends) {
                listFriends.getItems().add(f);
            }
            fileName.clear();
        }
        catch (MyExceptions e) {
            System.out.println(e);
        }
    }

    public void sortByLastName(ActionEvent actionEvent) {
        ArrayList<Friend> friends = new ArrayList<>(listFriends.getItems());
        friends.sort(Comparator.comparing(o -> o.Lname));
        listFriends.getItems().clear();
        for(Friend f: friends) {
            listFriends.getItems().add(f);
        }
    }

    public void sortByAge(ActionEvent actionEvent) {
        ArrayList<Friend> friends = new ArrayList<>(listFriends.getItems());
        friends.sort((o1, o2) -> {
            if(o1.age < o2.age) {
                return -1;
            }
            if(o1.age > o2.age) {
                return 1;
            }
            return 0;
        });
        listFriends.getItems().clear();
        for(Friend f: friends) {
            listFriends.getItems().add(f);
        }
    }
}
