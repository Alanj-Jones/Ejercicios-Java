import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean lexi = false;
        int C = 0;
        String upperA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String upperB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(A.length()+B.length());   //Primer Print
        if (A.compareTo(B) > 0){
                System.out.println("Yes");          //Segundo Print
        }else{
                System.out.println("No");           //Segundo Print
        }
        System.out.println(upperA+" "+upperB);      //Tecer Print
    }
}

/*
metodo 'compareTo()'
Es un metodo que sirve para comparar 2 Strings por orden alfabetico
si el resultado te da igual a 0, son iguales.
Si el resultado da > 0, la primera String va antes ordenada alfabeticamente
si el resultado da < 0, la segunda string va antes ordenada alfabeticamente
*/