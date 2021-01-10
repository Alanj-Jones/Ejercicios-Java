import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() > 0){
            String[] parts = s.split("[?',!._@ ]+");
            System.out.println(parts.length); 
            for (String string : parts) {
                System.out.println(string);
            }
        }else{
            System.out.println(0);
        }
        
        scan.close();
    }
}

