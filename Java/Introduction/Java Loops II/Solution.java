// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            for(int j = 0; j<n; j++){
                s = s + (int) (Math.pow(2,j) * b);
                System.out.print(s + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
