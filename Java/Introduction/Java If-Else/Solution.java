// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-if-else/problem

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 != 0 || N < 21 & N > 5){
            System.out.print("Weird");
        }
        else{
            System.out.print("Not Weird");
        }

        scanner.close();
    }
}
