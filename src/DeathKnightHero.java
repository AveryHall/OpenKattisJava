/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/deathknight
 *
 * Death knight Hero
 */

import java.util.Scanner;
public class DeathKnightHero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int wins = 0;

        for (int i = 0; i < n; i++) {

            boolean won = true;

            String moves = sc.nextLine();
            char prevMove = moves.charAt(0);
            for(int j = 1; j < moves.length(); j++) {
                char currMove = moves.charAt(j);
                if(currMove == 'D' && prevMove == 'C') {
                    won = false;
                    break;
                }
                prevMove = currMove;
            }

            if(won) { wins++; }

        }

        System.out.println(wins);

    }
}