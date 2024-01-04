package String_Problems;

/**
 * 1. Pangram Checking
 *
 * Check whether all english alphabets are present in the given sentence or not
 *
 * I/P: abc defGhi JklmnOP QRStuv wxyz
 *
 * O/P: True
 *
 * I/P: abc defGhi JklmnOP QRStuv
 *
 * O/P: False
 */
public class PanagramCheck {
    public static void main(String[] args) {
        System.out.println(isPanagram("abc defGhi JklmnOP QRStuv"));
    }
    public static boolean isPanagram(String word){
        word = word.replaceAll(" ","");
        word=word.toLowerCase();
        int[] alphabet = new int[26];
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            alphabet[c-'a']++;
        }

        for (int j : alphabet) {
            if (j == 0) return false;
        }
        return true;
    }

}
