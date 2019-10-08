// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/special-palindrome-again/problem

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        // count of special palindromes
        int count = 0;
        char sChars[] = s.toCharArray();
        for(int i =0; i<s.length(); i++){
            // index of different char
            int diff = -1;
            for(int j = i; j<s.length(); j++){
                // Check if first condition is met (all characters the same)
                if(sChars[i] == sChars[j]){
                    if(diff == -1){
                        count++;
                    }
                    // Check if second condition is met (same amount of same characters
                    // on both sides of different character)
                    else if(diff-i == j-diff){
                        count++;
                    }
                }
                else{
                    // One different character is allowed, so set its index to
                    // the current char if it isn't already defined, else break
                    if(diff == -1){
                        diff = j;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
