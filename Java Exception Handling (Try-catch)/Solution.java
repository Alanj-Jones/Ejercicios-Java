import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println( x / y);
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("java.util.InputMismatchException");
            } else if (e instanceof ArithmeticException) {
            System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }        
        scan.close();
    }
}