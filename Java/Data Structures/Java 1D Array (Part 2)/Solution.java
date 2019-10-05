// Author: Nicolas Schapeler
// Github: https://github.com/nschapeler
// Problem Statement: https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.*;
public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWin = false;
        ArrayList<Integer> seen = new ArrayList<>();
        Stack<Integer> moves = new Stack<Integer>();

        for(int i = 0; i<game.length;){
            if(!seen.contains(i)){
                seen.add(i);
                moves.push(i);
            }
            if(i+1 >= game.length || i+leap >= game.length){
                canWin = true;
                break;
            }
            if(!seen.contains(i+1) && game[i+1] == 0){
                i++;
            }
            else if(!seen.contains(i+leap) && game[i+leap] == 0){
                i += leap;
            }
            else if(i>0 && !seen.contains(i-1) && game[i-1] == 0){
                i--;
            }
            else{
                moves.pop();
                if(moves.size() > 0){
                    i = moves.peek();
                }
                else{
                    break;
                }
            }
        }
        return canWin;
    }

    public static boolean leap_pos(int dis, int[] game, int i){
        if(game[i+dis] == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
