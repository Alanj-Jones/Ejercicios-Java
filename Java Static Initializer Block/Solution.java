import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static Scanner in = new Scanner(System.in);
    private static int B = in.nextInt();
    private static int H = in.nextInt();
    
    private static boolean flag;
    static{
        try{
            if(B<1 || H<1){
                flag = false;
                throw new Exception("Breadth and height must be positive");
                    
            }else{
                flag = true;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

