/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/helpaphd
 *
 * Help a PhD candidate out!
 */

import java.util.Scanner;
public class HelpAPhD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {

            String problem = sc.nextLine();

            if(problem.charAt(0) == 'P') {
                System.out.println("skipped");
            } else {
                System.out.println(Integer.parseInt(problem.substring(0, problem.indexOf('+')))
                        + Integer.parseInt(problem.substring(problem.indexOf('+')+1)));
            }

        }

    }
}