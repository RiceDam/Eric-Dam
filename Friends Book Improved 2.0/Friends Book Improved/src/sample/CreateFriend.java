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
        fr = new FileReader(fileName +".txt");
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
        Long num;
        int year;
        int pos = 0;
        int comma = 0;
        int count = 0;
        String Fname = "";
        String Lname = "";
        String phone = "";
        String age = "";
        //Checks each line in the text file and adds them to the string
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(",")) {
                comma = i;
                for(int k=0;k<s.substring(0,comma).length();k++) {
                    if(s.substring(k,k+1).equals(" ")) {
                        pos = k;
                        Fname = s.substring(0,pos);
                        Lname = s.substring(pos+1, comma);
                    }
                }
                phone = s.substring(comma+1, comma+11);
                age = s.substring(comma+11);
            }
        }
        //Adds friend to the friends list if there is no duplicate
        num = Long.parseLong(phone);
        year = Integer.parseInt(age);
        Friend n = new Friend(Fname,Lname, num, year);
        friends.add(n);
    }
}
