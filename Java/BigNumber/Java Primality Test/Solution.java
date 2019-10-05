// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-primality-test/problem

import java.math.*;
import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger big_n = new BigInteger(n);
        if(big_n.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.print("not prime");
        }

        scanner.close();
    }
}
