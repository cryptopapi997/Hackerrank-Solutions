// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char s_char[] = s.toCharArray();
        ArrayList<String> tokens = new ArrayList<>();
        String token = "";
        for(int i = 0; i<s_char.length; i++){
            if(Character.isLetter(s_char[i])){
                token = token + s_char[i];
            }
            else{
                if(token.length() != 0){
                    tokens.add(token);
                }
                token = "";
            }
        }
        if(token.length() != 0){
            tokens.add(token);
        }
        System.out.println(tokens.size());
        for(String t:tokens){
            System.out.println(t);
        }
    }



}
