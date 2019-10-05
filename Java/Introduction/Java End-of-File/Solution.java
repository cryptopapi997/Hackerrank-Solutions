// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String s = "";
        while(scanner.hasNext()){
            i++;
            s = scanner.nextLine();
            System.out.println(i + " " + s);
        }
    }
}

