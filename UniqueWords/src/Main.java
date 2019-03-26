import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> words = new HashSet<>();
        FileReader fr = new FileReader("illiad.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            String [] temp = line.split("[ .,:;\"()!?-]");
            for(String s: temp) {
                s = s.toLowerCase();
                if(s.contains("\'")) {
                    if(s.indexOf("\'") == 0) {
                        s = s.substring(1);
                    }
                    if(s.indexOf("\'") == s.length()) {
                        s = s.substring(0,s.length()-1);
                    }
                }
                words.add(s);
            }
        }
        for(String s: words) {
            System.out.println(s);
        }
        System.out.println(words.size());
        br.close();
    }
}
