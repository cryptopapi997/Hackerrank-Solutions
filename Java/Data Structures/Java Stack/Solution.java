// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(input.length() == 0){
                System.out.println("true");
            }
            Stack<Character> s = new Stack<>();
            char chars[] = input.toCharArray();

            for(int i = 0; i<chars.length; i++){
                if(chars[i] == '{' ||chars[i] == '(' ||chars[i] == '[' ){
                    s.push(chars[i]);
                }
                else if(chars[i] == '}'){
                    if(!s.empty() && s.peek() == '{'){
                        s.pop();
                    }
                    else{
                        s.push(chars[i]);
                    }
                }
                else if(chars[i] == ')'){
                    if(!s.empty() && s.peek() == '('){
                        s.pop();
                    }
                    else{
                        s.push(chars[i]);
                    }
                }
                else if(chars[i] == ']'){
                    if(!s.empty() && s.peek() == '['){
                        s.pop();
                    }
                    else{
                        s.push(chars[i]);
                    }
                }
            }
            System.out.println((s.empty()) ? "true": "false");
        }

    }
}
