
import java.util.*;

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
                      for(int j = 0; j<tempString.length(); j++) {
                          if(tempString.charAt(j) == '>') {
                              temp = j;
                              break;
                          }                          
                      }
                      i += temp;
                  } else {
                      result += line.charAt(i);
                  }
              }
              System.out.println(result);
			
			testCases--;
		}
        in.close();
	}
}


