/**
 * Avery Hall
 * 5/22/2018
 * https://open.kattis.com/problems/easiest
 *
 * The Easiest Problem Is This One
 */

import java.util.Scanner;
public class Easiest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        int n = Integer.parseInt(N);

        while (n != 0) {

            boolean isMinimal = false;

            // Find N's digit sum
            int nDigitSum = 0;
            for(int i = 0; i < N.length(); i++) {
                nDigitSum += Integer.parseInt(N.charAt(i) + "");
            }

            // Now find the smallest number p greater than 10 that satisfies N * p = M, where
            // N and M have the same digit sum.
            int p = 10;
            while (!isMinimal) {

                p++;

                int m = n * p;
                String M = m + "";

                // Find M's digit sum and compare it to N's, if equal the minimal p is found.
                int mDigitSum = 0;
                for(int i = 0; i < M.length(); i++) {
                    mDigitSum += Integer.parseInt(M.charAt(i) + "");
                }

                if(mDigitSum == nDigitSum) { isMinimal = true; }

            }

            // Output the minimal p value and input next test case
            System.out.println(p);

            N = sc.nextLine();
            n = Integer.parseInt(N);

        }

    }
}
