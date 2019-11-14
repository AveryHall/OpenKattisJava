/**
 * Avery Hall
 * 5/13/2019
 * https://open.kattis.com/problems/earlywinter
 *
 * Early Winter:
 */

import java.util.Scanner;
public class EarlyWinter {

    public static void main(String[] args) {

        //Create scanner object sc to read from default input
        Scanner sc = new Scanner(System.in);

        //Initialize variables for n, the number of years, and dm, the current year's gap to the first snow day
        int n = Integer.parseInt(sc.next());
        int dm = Integer.parseInt(sc.next());
        int k = 0;
        boolean isKVal = true;

        //Scan remaining input (the snow gaps per year from d(m-1) to d(m-n))
        for(int i = 0; i < n; i++) {

            int dmi = Integer.parseInt(sc.next());

            if(dmi > dm) {k++; if(i==(n-1)){isKVal = false;}}
            else {break;}

        }

        //Output Results
        if(!isKVal) {
            System.out.println("It had never snowed this early!");
        } else {
            System.out.println("It hadn't snowed this early in " + k + " years!");
        }

    }
}