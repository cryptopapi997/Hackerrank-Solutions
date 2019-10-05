// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int an = 0;
        HashMap<String, Integer> subs = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            for(int j =i+1; j<s.length()+1; j++){
                char pos[] = s.substring(i,j).toCharArray();
                Arrays.sort(pos);
                String posString = new String(pos);

                if(subs.containsKey(posString)){
                    int val = subs.get(posString);
                    an += val;
                    subs.put(posString,val+1);
                }
                else{
                    subs.put(posString, 1);
                }
            }
        }
        return an;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}