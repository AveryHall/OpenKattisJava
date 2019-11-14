/**
 * Avery Hall
 * 5/28/2018
 * https://open.kattis.com/problems/railroad2
 *
 * Railroad
 */

import java.util.Scanner;
public class Railroad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        int R = 4*X + 3*Y;

        if(R % 2 == 0) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }

    }
}