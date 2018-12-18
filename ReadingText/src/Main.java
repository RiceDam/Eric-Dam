import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int lineCount = 1;
        int wordCount = 0;
        int index = 0;
        while((line = br.readLine()) != null) {
            System.out.println("Just read: " + line);
            lines.add(line);
            //Adds line to string array and separates them by words
            String [] words = line.split("[ .]");
            for(String s: words) {
                //If string s has a comma in it, remove the comma
                if(s.contains(",")) {
                    s = s.substring(0,s.length()-1);
                }
                //If string s is a blank space, increase the line count and reset the index
                if(s.toLowerCase().equals("")) {
                    lineCount++;
                    index = 0;
                }
                //If string s is the word that wants to be found, increase the word count and print where the word is located
                if(s.toLowerCase().equals("programmable")) {
                    wordCount++;
                    System.out.println("Word found at index: " + index + " in line " + lineCount);
                }
                index ++;
            }
        }
        System.out.println("Total words found: " + wordCount);
        br.close();
    }
}
