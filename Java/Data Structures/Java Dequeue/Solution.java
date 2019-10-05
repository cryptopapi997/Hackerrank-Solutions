// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int largest = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m){
                if(set.size() > largest){
                    largest = set.size();
                }
                int first = (int)deque.remove();
                if(!deque.contains(first)){
                    set.remove(first);
                }
            }
        }
        System.out.print(largest);

    }
}


