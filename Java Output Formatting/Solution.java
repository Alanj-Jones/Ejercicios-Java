import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.printf("%-15s%03d%n",s1,x);

                //Con '%-15s' Estoy Justificando a la izquierda una variable de tipo STRING por 15 caracteres
                //Con '%03d'  Estoy Haciendo que una variable de valor decimal tengan una longitud de 3 digitos y que si no lo tienen se le agregue un 0
                //Con '%n' Salto a la siguiente linea
               
                
            }
            System.out.println("================================");

    }
    

}
