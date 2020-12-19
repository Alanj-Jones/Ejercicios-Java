public class CheckVowels {
    public static int getCount(String str) {
      int vowelsCount = 0;
      str.toLowerCase();
      for(int i = 0; i<str.length(); i++){
              switch(str.charAt(i)){
                  case 'a':
                      vowelsCount++;
                      break;
                  case 'e':
                      vowelsCount++;
                      break;
                  case 'i':
                      vowelsCount++;
                      break;
                  case 'o':
                      vowelsCount++;
                      break;
                  case 'u':
                      vowelsCount++;
                      break;
              }
          }
        return vowelsCount;
    }
    
    public static void main(String args[]){
        System.out.println(getCount("Cinco vocales")); // 5
        System.out.println(getCount("hola")); // 2
    }
}