// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/flipping-bits/problem

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        // The flipped value of a 32-bit unsigned int is just its difference
        // with the max value (2^32 - 1), as the sum of the number and its complement
        // has to be the max value of an unisgned int where every bit is 1
        return (long) Math.pow(2,32) -1 - n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            System.out.println(n);
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
