package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField getName;
    public TextField getPhone;
    public ListView listFriends;
    public TextField fileName;

    public void createFriend(ActionEvent actionEvent) {
        //Adds the friend to the list on the program window
        Friend f = new Friend(getName.getText(),getPhone.getText());
        listFriends.getItems().add(f);
        getName.clear();
        getPhone.clear();
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        // Saves list of friends to a text file
        ObservableList<Friend> myList = listFriends.getItems();
        for(Friend f: myList) {
            f.writeToFile(fileName.getText());
        }
        fileName.clear();
        listFriends.getItems().clear();
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException{
        //Loads the list of friends
        listFriends.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends(fileName.getText());
        for (Friend f: friends) {
            listFriends.getItems().add(f);
        }
        fileName.clear();
    }
}
