package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField name;
    public TextField phone;
    public Button addF;
    public ListView<Friend> listFriends = new ListView<Friend>();
    public Label dname;
    public Label dphone;

    public void addFriend(ActionEvent actionEvent) {
        String n = name.getText();
        String p = phone.getText();
        Friend f = new Friend(n,p);
        listFriends.getItems().add(f);
        name.clear();
        phone.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend f;
        f = listFriends.getSelectionModel().getSelectedItem();
        dname.setText(f.name);
        dphone.setText(f.phone);
    }
}
