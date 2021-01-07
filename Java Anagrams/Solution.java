import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        java.util.HashMap<Character,Integer> map = new java.util.HashMap<Character,Integer>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() == b.length()){
            for (int i=0;i<b.length();i++){

                if (map.containsKey(b.charAt(i))){
                    Integer value = map.get(b.charAt(i));
                    map.replace(b.charAt(i), value+=1);
                }
                else{
                    map.put(b.charAt(i), 1);
                }
            }
            for (int j=0; j<a.length();j++){
                if( map.containsKey(a.charAt(j)) && (map.get(a.charAt(j))>0) ){
                    map.replace(a.charAt(j), map.get(a.charAt(j))-1);
                    if(map.get(a.charAt(j)) == 0){
                        map.remove(a.charAt(j));
                    }
                }else{
                    return false;
                }
            }
            return (map.isEmpty())?true:false;
        }

        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

