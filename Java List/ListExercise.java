import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int elements = in.nextInt();
        
        for (int i=0; i<elements; i++) {
            myList.add(i, in.nextInt());
        }

        int operations = in.nextInt();

        for (int i=0; i<operations; i++) {
            String query = in.next();
            if (query.equals("Insert")) {
                try {
                    myList.add(in.nextInt(), in.nextInt());
                } catch (Exception e) {
                    System.out.println("Error!");
                }
            } else if (query.equals("Delete")) {
                try {
                    myList.remove(in.nextInt());
                } catch (Exception e) {
                    System.out.println("Error!");
                }
            }
        }

        for (Integer i : myList) {
            System.out.print(i+ " ");
        }

        in.close();
    }
}
