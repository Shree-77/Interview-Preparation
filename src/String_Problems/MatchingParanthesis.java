package String_Problems;

/**
 * Write a program that will take a string as input. The program will then determine whether each left parenthesis ‘(’ has a matching right parenthesis ‘)’ and also all the ‘)’ has a  consecutive ‘(‘. If so, the program will print 0 else the program will print 1.
 * Example 1
 * Input: HELLO AND (WELCOME (TO THE) TCEA (CONTEST)TODAY)IS (SATURDAY())
 * Output: 0
 * Example 2
 * Input: (9*(7-2)*(1*5)
 * Output: 0
 */

import java.util.Stack;

public class MatchingParanthesis {
    public static void main(String[] args) {
        System.out.println(Match(" (9*(7-2)*(1*5)"));
    }
    public static int Match(String input){
        char []c=input.toCharArray();
        Stack<Character>stack=new Stack<>();

        for (char value : c) {
            if (value == ')') {
              if(!stack.isEmpty() && stack.peek()=='('){
                  stack.pop();
              }
            }else if(value=='('){
                stack.push(value);
            }

        }
        return stack.isEmpty()?0:1;
    }

}
