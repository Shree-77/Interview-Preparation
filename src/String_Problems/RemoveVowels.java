package String_Problems;

/**
 * Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string. If there are two or more vowels that occur together then the program shall ignore all of those vowels.
 * Example 1
 * Input:  Cat
 * Output:  Ct
 * Example 2
 * Input:  Compuuter
 * Output: Cmpuutr
 */
public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(RemoveVowel("Cat"));
    }
    public static String RemoveVowel(String word){
       StringBuilder res= new StringBuilder();
       for(int i=0;i<word.length();i++){
           if(!isVowel(word.charAt(i))){
               res.append(word.charAt(i));
           }
       }
       return  res.toString();
    }
    public static boolean isVowel(char c){
        c= Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
