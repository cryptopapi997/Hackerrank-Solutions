// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char a[] = A.toCharArray();
        char b[] = new char[a.length];
        for(int i = 0; i<a.length; i++){
            b[b.length - 1 - i] = a[i];
        }
        if(Arrays.equals(b, a)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}
