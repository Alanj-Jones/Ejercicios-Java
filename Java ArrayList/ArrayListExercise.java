import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
 
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiple = new ArrayList<>(); 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            ArrayList<Integer> single = new ArrayList<>();
            int quantity = in.nextInt();
            for (int j=0; j<quantity; j++) {
                single.add(in.nextInt());
            }
            multiple.add(single);
        }        
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            try {
                System.out.println(multiple.get(in.nextInt()-1).get(in.nextInt()-1));            
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
