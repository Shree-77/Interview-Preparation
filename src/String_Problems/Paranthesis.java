package String_Problems;

import java.util.Stack;

/**
 * 1. Check Paranthesess and if valid calculate.
 *   (i) a=1, b=2, c=3,.....z=26
 *   (ii) aa=11, bb=22,.... zb=262
 *
 * input : (100+23) + (a*50) * (b*c)
 *  output :  valid  -->  6156
 *
 * input : (100+23) + ((a*50) + (b*c))
 * output : valid --> 6888
 *
 * input : (a+b(c-))
 *  output :  invalid
 *
 * input : (a*b(c*d))
 * output :  invalid
 */
public class Paranthesis {
    public static void main(String[] args) {

    }
    public static boolean isValid(String input){

        char[]chars = input.toCharArray();
        int ans =0;

        Stack<Character>stack = new Stack<>();
        for(char i : chars){
            if(stack.isEmpty() && i=='('){
                stack.push(i);
            }else if(stack.peek()=='(' && i==')'){
                stack.pop();
            }else if(stack.peek()=='('&& i=='('){
                stack.push(i);
            }
        }
        return  false;
    }


}
