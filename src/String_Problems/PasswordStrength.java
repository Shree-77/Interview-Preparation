package String_Problems;

import java.util.regex.Pattern;

/**
 * 2. Password Strength
 *
 * Find the strength of the given password string based on the conditions
 *
 * Four rules were given based on the type and no. of characters in the string.
 *
 * Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
 *
 * Medium – Two rules are satisfied
 *
 * Good – Three rules satisfied
 *
 * Strong – All Four rules satisfied
 *
 *
 *
 * I/P: Qw!1        O/P: Weak
 *
 * I/P: Qwertyuiop      O/P: Medium
 *
 * I/P: QwertY123       O/P: Good
 *
 * I/P: Qwerty@123    O/P: Strong
 */
public class PasswordStrength {
    public static void main(String[] args) {
        System.out.println(checkStrength("Qwerty@123"));
    }

    public static String checkStrength(String input){
        String mediumPattern = "[a-zA-Z]+";
        String goodPattern = "[a-zA-Z0-9]+";
        String strongPattern = "[A-Z]+[a-z]+@+[0-9]+";
        if(input.length()<8){
            return "Weak";
        }else if(Pattern.matches(mediumPattern,input)){
            return "Medium";
        }else if(Pattern.matches(strongPattern,input)){
            return "Strong";
        } else if (Pattern.matches(goodPattern,input)) {
            return "Good";
        }
        return "Unknown";
    }

}
