// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        BigDecimal s_n[] = new BigDecimal[s.length -2];

        for(int j=0; j<s_n.length;j++){
            s_n[j] = new BigDecimal(s[j]);
        }

        BigDecimal temp = new BigDecimal(0.0);
        String temp_s = "";
        for(int k = 0; k<s_n.length; k++){
            for(int o = k+1; o<s_n.length; o++){
                if(s_n[o].compareTo(s_n[k]) == 1){
                    temp = s_n[o];
                    s_n[o] = s_n[k];
                    s_n[k] = temp;
                    temp_s = s[o];
                    s[o] = s[k];
                    s[k] = temp_s;
                }
            }
        }




        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
