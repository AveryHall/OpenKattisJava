/**
 * Avery Hall
 * 5/14/2018
 * https://open.kattis.com/problems/conundrum
 *
 * Conundrum
 */

import java.util.Scanner;
public class Conundrum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cypherText = sc.nextLine();

        int numDays = 0;
        for(int i = 0; i < cypherText.length(); i++) {
            if ( i % 3 == 0 && !(cypherText.charAt(i) + "").equals("P")) {
                numDays++;
            } else if (i % 3 == 1 && !(cypherText.charAt(i) + "").equals("E")) {
                numDays++;
            } else if (i % 3 == 2 && !(cypherText.charAt(i) + "").equals("R")) {
                numDays++;
            }
        }

        // Outputs the total number of days needed for Per to change the cypher's text to repeat his name
        System.out.println(numDays);

    }
}