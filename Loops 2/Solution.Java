import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int temp_result = a;               
            
            for(int j = 0; j<n; j++){
                
                int ecuation = ((int)Math.pow(2,j)*b);
                temp_result += ecuation;
                if(j == (n-1)){
                    System.out.print(temp_result+"\n");
                }else{
                    System.out.print(temp_result + " ");    
                }
                                
            }         
        }
        in.close();
    }
}