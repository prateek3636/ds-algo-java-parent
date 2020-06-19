package algoexpert.stack;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

    public static void test() {
        String s = "{[({})]}}";
        boolean min = solution(s);
        System.out.println(min);
    }

    private static Boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    Character c = stack.pop();
                    if(c == '{' && s.charAt(i) != '}'){
                        return false;
                    }
                    if(c == '(' && s.charAt(i) != ')'){
                        return false;
                    }
                    if(c == '[' && s.charAt(i) != ']'){
                        return false;
                    }
                }
            }

        }

        return stack.isEmpty();
    }

}
