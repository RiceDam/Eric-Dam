package sample;

import java.io.BufferedReader;
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
        //Creates an ArrayList with all the friends in it
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
        int count = 0;
        String name = "";
        String phone = "";
        //Checks each line in the text file and adds them to the string
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(",")) {
                pos = i;
                name = s.substring(0,pos);
                phone = s.substring(pos+1);
            }
        }
        //Adds friend to the friends list if there is no duplicate
        Friend n = new Friend(name,phone);
        if(friends.size() > 0) {
            for(int i=0; i<friends.size(); i++) {
                if(friends.get(i).compareFriends(n)) {
                    count+=1;
                }
            }
            if (count < 1) {
                friends.add(n);
            }
        }
        else {
            friends.add(n);

        }
    }
}
