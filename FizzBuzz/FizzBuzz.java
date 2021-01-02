public class FizzBuzz {

    public static String fizzBuzz(Integer i) {

        if ((i % 3 == 0) && (i % 5 == 0)){
          return "FizzBuzz";
        } else if (i % 3 == 0){
          return "Fizz";
        }else if(i % 5 == 0){
          return "Buzz";
        }else return i + "";
    }

    public static void main(String[] args) {
      System.out.println(fizzBuzz(10));
    }
}
