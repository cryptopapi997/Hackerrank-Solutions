// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char a_sorted[] = sort(a.toCharArray());
        char b_sorted[] = sort(b.toCharArray());

        if(a_sorted.length != b_sorted.length){
            return false;
        }

        for(int i = 0; i < a_sorted.length; i++){
            if(a_sorted[i] != b_sorted[i]){
                return false;
            }
        }
        return true;
    }

    static char[] sort(char[] c){
        char temp;
        for (int i = 0; i<c.length; i++){
            for(int j = i+1; j<c.length; j++){
                c[i] = Character.toUpperCase(c[i]);
                c[j] = Character.toUpperCase(c[j]);
                if(c[i] > c[j]){
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
