// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        String a_copy = a;
        for(char c : a.toCharArray()){
            if(b.indexOf(c) != -1){
                b = b.replaceFirst(Character.toString(c),"");
                a_copy = a_copy.replaceFirst(Character.toString(c),"");
            }
        }
        return a_copy.length() + b.length();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}