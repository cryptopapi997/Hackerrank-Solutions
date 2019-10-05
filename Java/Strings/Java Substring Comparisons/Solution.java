// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        char s_char[] = s.toCharArray();
        String pos[] = new String[s_char.length + 1 - k];
        String temp;

        for(int i=0; i<s_char.length-k+1; i++){
            char current[] = new char[k];
            for(int j=0; j<k; j++){
                current[j] = s_char[i + j];
            }

            pos[i] = new String(current);

        }

        for(int o=0; o<pos.length; o++){
            for(int h=o+1; h<pos.length; h++){
                if (pos[o].compareTo(pos[h])>0) {
                    temp = pos[o];
                    pos[o] = pos[h];
                    pos[h] = temp;
                }
            }
        }

        return pos[0] + "\n" + pos[pos.length-1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}