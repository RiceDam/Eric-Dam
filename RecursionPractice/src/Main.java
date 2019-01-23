import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();

    public static void setup() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Tree.txt"));
        while(scan.hasNextLine()){
            String[] temp = scan.nextLine().split(" ");
            int id = Integer.parseInt(temp[0]);
            int left = Integer.parseInt(temp[1]);
            int right = Integer.parseInt(temp[2]);
            nodes.add(new Node(id,left,right));
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
       setup();
       leaves(nodes.get(0));
    }
    private static void leaves(Node n) {
        if(n == null) {
            return;
        }
        if(n.left == 0 && n.right == 0) {
            System.out.println(n.id);
        }
        leaves(findN(n.left));
        leaves(findN(n.right));

    }
    public static Node findN(int i) {
        for(Node n: nodes) {
            if(n.id == i) {
                return n;
            }
        }
        return null;
    }
}
