// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for(int n : arr){
            if(n == 0){
                zero++;
            }
            else{
                if((int) Math.sqrt(n*n) == n){
                    positive++;
                }
                else{
                    negative++;
                }
            }
        }
        System.out.println(((double)positive/(double)arr.length));
        System.out.println(((double)negative/(double)arr.length));
        System.out.print(((double)zero/(double)arr.length));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}