import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        Scanner sc = new Scanner(System.in);
        
		
		while (sc.hasNext()) {
            String input=sc.next();
            
            //Lo convierto en un array de caracteres para poder subirlos al stack
            char[] iterable = input.toCharArray();
            Stack<Character> myStack = new Stack<>();
            Stack<Character> copia = new Stack<>();
            //Hago un foreach para subir al stack cada caracter
            char lastChar = input.charAt(input.length()-1);
            if (lastChar == '{' || lastChar == '(' || lastChar == '[' || input.isEmpty()){
                System.out.println("false");
            }else{
                
                for (Character ch : iterable){
                    myStack.push(ch);                
                }
                for (Character character : myStack) {
                    switch(character){
                        case '{':
                            if(myStack.search('}')>-1){
                                copia.push(character);
                                copia.push('}');
                            }
                            break;
                            
                        case '(':
                            if(myStack.search(')')>-1){
                                copia.push(character);
                                copia.push(')');
                            }
                            break;
                        case '[':
                            if(myStack.search(']')>-1){
                                copia.push(character);
                                copia.push(']');
                            }
                            break;
                        default:
                            break;
                    }
                }  
                System.out.println(copia.size() == myStack.size());
            }


            //System.out.println(myStack);
            //System.out.println(copia); 
		}		
	}
}

