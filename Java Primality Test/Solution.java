import java.math.*;
import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        BigInteger bInteger = new BigInteger(n);

        if(bInteger.signum() == 1){
            
            System.out.println((bInteger.isProbablePrime(1))?"prime":"not prime");

            
        }else{
            
            System.out.println("not prime");
        }

        scanner.close();
    }
}
