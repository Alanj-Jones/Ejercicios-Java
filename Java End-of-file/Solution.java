import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int iteration = 1;
        while(true){            
            if (in.hasNext()){
            System.out.println(iteration + " " + in.nextLine());
            iteration++;
            }else{
                break;
            }    
        }
        in.close();
        
    }
}