import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Solution {


    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Ingrese su Cadena de caracteres");
        int k =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
    

       String sequence = s.substring(0,k);
       String smallest= sequence;
       String largest = sequence;

       for (int i = 1; i <= (s.length() -k); i++){
           sequence = s.substring(i, (i+k));

           if (sequence.compareTo(smallest)<0){
               smallest = sequence;
           }

           if (sequence.compareTo(largest)>0){
               largest = sequence;
           }
       }
        
       System.out.println("Largest: "+ largest+"\nSmallest: "+smallest);

        
       
    }
}