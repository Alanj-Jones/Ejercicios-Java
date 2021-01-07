import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        String reversed ="";
        for (int i = A.length() -1; i>= 0; i--){
            reversed += A.charAt(i);
        }
        System.out.println((A.equals(reversed))?"Yes":"No");
        
    }
}
