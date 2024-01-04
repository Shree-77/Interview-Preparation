package String_Problems;

import java.util.HashMap;

/**
 * Given two strings, find the first occurrence of all characters of second string in the first string and
 * print the characters between the least and the highest index
 * I/P: ZOHOCORPORATION PORT
 * O/P: OHOCORPORAT
 * Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
 * So print the characters of the first string in this inex range i.e. OHOCORPORAT
 */
public class First_Occurance {
    public static void main(String[] args) {
        System.out.println(Occurance("ZOHOCORPORATION PORT"));
    }
    public static String Occurance(String word){
        String [] input = word.split(" ");
        String first_String = input[0];
        String second_string = input[1];

        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<second_string.length();i++){
                map.putIfAbsent(second_string.charAt(i),i);
        }

        for(int i=0;i<first_String.length();i++){
            if(map.containsKey(first_String.charAt(i))){
                max=Math.max(max,i);
                min=Math.min(min,i);
            }
        }
        return first_String.substring(min,max-1);
    }
}
