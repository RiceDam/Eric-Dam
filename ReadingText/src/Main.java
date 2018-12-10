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
            lines.add(line);
            String [] words = line.split("[ .]");
            for(String s: words) {
                if(s.contains(",")) {
                    s = s.substring(0,s.length()-1);
                }
                if(s.toLowerCase().equals("")) {
                    lineCount++;
                    index = 0;
                }
                if(s.toLowerCase().equals("programmable")) {
                    wordCount++;
                    System.out.println("Word found at index: " + index + " in line " + lineCount);
                }
                index ++;
            }
            System.out.println(Arrays.toString(words));
        }
        System.out.println(wordCount);
        br.close();
    }
}
