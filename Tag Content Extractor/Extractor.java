import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Extractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              String result = "";
              for (int i = 0; i<line.length(); i++) {
                  if(line.charAt(i) == '<') {
                      String tempString = line.substring(i,line.length());
                      int temp = 0;
                      for(int j = i+1; j<tempString.length(); j++) {
                          if(tempString.charAt(j) == '>') {
                              
                          }

                      }
                  }
              }
			
			testCases--;
		}
        in.close();
	}
}


