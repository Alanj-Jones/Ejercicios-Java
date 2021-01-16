import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = a[n-i-1];
        }
        for(int i=0; i<n;i++){           
            System.out.print(b[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}