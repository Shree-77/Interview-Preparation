package String_Problems;

import java.util.HashMap;

public class SubString {

    public static void main(String[] args) {
        System.out.println(strstr("GeeksForGeeks" , "For"));
    }

    //Function to locate the occurrence of the string x in the string s.
    public static int strstr(String s, String x)
    {
        // Your code here
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : x.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int end =0, start =0;

        StringBuilder res= new StringBuilder();

        while(end<s.length()){
            res.append(s.charAt(end));

            while(res.length()>x.length()){
                res.deleteCharAt(start);
                start++;
            }

            if(res.toString().equals(x)){
                return start;
            }
            end++;
        }
        return -1;
    }
}


