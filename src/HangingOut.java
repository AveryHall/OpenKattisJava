/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/hangingout
 *
 * Hanging Out on the Terrace
 */

import java.util.Scanner;
public class HangingOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());

        int NumOnTerrace = 0;
        int denied = 0;

        for(int i = 0; i < E; i++) {

            String EorL = sc.next();
            int p = Integer.parseInt(sc.next());

            if(EorL.charAt(0) == 'e') {

                if(NumOnTerrace + p > L) {
                    denied++;
                } else {
                    NumOnTerrace += p;
                }

            } else {
                NumOnTerrace -= p;
            }

        }

        System.out.println(denied);

    }
}