// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        // Hashmap to map how many times a character occurs
        HashMap<Character, Integer> counter = new HashMap<>();
        for(char c: s.toCharArray()){
            if(counter.containsKey(c)){
                counter.put(c,counter.get(c) + 1);
            }
            else{
                counter.put(c, 1);
            }
        }

        // Sort count of letters to determine highest and lowest count
        Integer[] counts = counter.values().toArray(new Integer[0]);
        Arrays.sort(counts);

        int low = counts[0];
        int high = counts[counts.length-1];

        if(low == high){
            return "YES";
        }
        // Check if the String can be made valid by removing the most
        //or least frequent character once
        else if(high - low == 1 && high != counts[counts.length -2]){
            return "YES";
        }
        else if(low == 1 && counts[1] == high){
            return "YES";
        }

        return "NO";
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}