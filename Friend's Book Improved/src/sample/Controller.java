package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField getName;
    public TextField getPhone;
    public ListView listFriends;

    public void createFriend(ActionEvent actionEvent) {
        listFriends.getItems().add(new Friend(getName.getText(), getPhone.getText()));
        getName.clear();
        getPhone.clear();
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = listFriends.getItems();
        for(Friend f: myList) {
            f.writeToFile();
        }
        listFriends.getItems().clear();
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException{
        listFriends.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("friends.txt");
        for (Friend f: friends) {
            listFriends.getItems().add(f);
        }
    }
}
