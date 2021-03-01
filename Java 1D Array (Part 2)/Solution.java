import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int gLength = game.length - 1;
        int currentPosition = 0;

        for (int i = 0; i < game.length; i++) {
            int tempPos = currentPosition;
            if (currentPosition >= gLength ){
                return true;
            }

            if (currentPosition + leap > gLength) {
                currentPosition += leap;
            } else if (currentPosition + leap <= gLength && game[currentPosition + leap] != 1) {
                    currentPosition += leap;
            } else if (game[currentPosition + 1] != 1) {
                currentPosition++;
            } else if (currentPosition != 0 && game[currentPosition - 1] != 1) {
                currentPosition--;
            }

            // System.out.println(currentPosition);
            if (tempPos == currentPosition) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}