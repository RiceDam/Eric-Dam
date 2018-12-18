package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static String phone;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String fileName) throws IOException {
        fr = new FileReader("friends.txt");
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while((line = br.readLine()) != null) {
            if(!line.equals(";")) {
                friendString += line;
            }
            else {
                parseFriend(friendString);
                friendString = "";
            }
        }
        return friends;
    }

    public static void parseFriend(String s) {
        int pos = 0;
        String name = "";
        String phone = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(",")) {
                pos = i;
                name = s.substring(0,pos);
                phone = s.substring(pos+1);
            }
        }
        if (Friend.compareFriends(Friend(name, phone) == false)) {
            friends.add(new Friend(name, phone));
        }
    }
}
