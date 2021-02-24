import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        int count = 0;
        for (int i=0; i<n; i++) {
            myArray[i] = scan.nextInt();
        }

        for (int j=0; j<n;j++) {
            int sum = 0;
            for (int k=j; k<n; k++) {
                sum += myArray[k];
                if (sum<0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        scan.close();
    }
}