/**
 * Avery Hall
 * 11/13/2019
 * https://open.kattis.com/problems/hydrasheads
 *
 *
 * Hydra's Heads: Knight PyPy is trying to kill a Hydra but only knows 4 attacks:
 * 1. Cut Off 1 Head
 * 2. Cut Off 1 Tail
 * 3. Cut Off 2 Heads
 * 4. Cut Off 2 Tails
 *
 * However, when:
 * 1 Head is cut off, 1 Head grows right back
 * 1 Tail is cut off, two Tails grow right back
 * 2 Heads are cut off, nothing grows back
 * 2 Tails are cut off, 1 Head grows back
 *
 * The goal is the determine for each test case (up to 50), what is the lowest number of attacks needed to kill the
 * given Hydra?
 *
 * Input is given line by line. Each line is a test case, and each line consists of two values separated by spaces,
 * the Number of Heads (H) and the number of Tails (T). The in of the test cases is always denoted by a line with "0 0".
 *
 * The key to solving this problem is to:
 * 1. Iterate over each test case
 * 2. For each case start cutting 2 Tails until at most 2 remain.
 * 3. Cut 2 Heads until at most 1 remains.
 * 4. Solve for the base cases.
 * 5. Output the Result.
 *
 *
 */

import java.util.Scanner;
public class HydrasHeads {

    private static int H = 0;
    private static int T = 0;
    private static int M = 0;
    private static boolean isPossible = true;

    private static void attack(int a) {
        if (a == 1) { M++; }                // Cut 1 Head
        if (a == 2) { T++; M++; }           // Cut 1 Tail
        if (a == 3) { H -= 2; M++; }        // Cut 2 Heads
        if (a == 4) { T -= 2; H++; M++; }   // Cut 2 Tails
    }

    public static void main(String[] args) {

        // Init new scanner object for I/O and a String to store the current test case values
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();     // The tests are guaranteed to always be less than 50 and to end with a line containing "0 0"


        // For each test case (until "0 0")
        while(!testCase.equals("0 0")) {

            // Separated the input values and stored them as integers.
            String[] input = testCase.split(" ");
            H = Integer.parseInt(input[0]);         // The number of Hydra Heads
            T = Integer.parseInt(input[1]);         // the number of Hydra Tails
            M = 0;                                  // The number of moves PyPy has made.
            isPossible = true;                      // Is killing the current Hydra possible?


            // Attack the Hydra, starting with the Tails until 2 or less remain, then attack heads
            while(T > 2) { attack(4); } // Replacement: T -= 2; H++; M++;
            while(H > 1) { attack(3); } // Replacement: H -= 2; M++;

            //Given the attack strategy above, only the base cases remain
            if (H == 1) {

                // BASE CASE: H = 1, T = 0 -- It's Impossible to kill
                if(T == 0) {
                    isPossible = false; // That means H was odd and T = 0 (There never was any tail), so it's unsolvable.
                }

                //BASE CASE: H = 1, T = 1. It takes 3 moves.
                if(T == 1) {
                    attack(2); // H = 1 , T = 2
                    attack(4); // H = 2 , T = 0
                    attack(3); // H = 0 , T = 0     Replacement: M+=3;
                }

                //BASE CASE: H = 1, T = 2. It takes 2 moves.
                if(T == 2) {
                    attack(4); // H = 2 , T = 0
                    attack(3); // H = 0 , T = 0     Replacement: M+=2;
                }
            } else { // H = 0

                //BASE CASE: H = 0, T = 1. It takes 6 moves.
                if (T == 1) {
                    attack(2); // H = 0 , T = 2
                    attack(2); // H = 0 , T = 3
                    attack(2); // H = 0 , T = 4
                    attack(4); // H = 1 , T = 2
                    attack(4); // H = 2 , T = 0
                    attack(3); // H = 0 , T = 0     Replacement: M += 6
                }

                //BASE CASE: H = 0, T = 2. It takes 5 moves.
                if (T == 2) {
                    attack(2); // H = 0 , T = 3
                    attack(2); // H = 0 , T = 4
                    attack(4); // H = 1 , T = 2
                    attack(4); // H = 2 , T = 0
                    attack(3); // H = 0 , T = 0     Replacement: M += 5
                }
            }


            //Print the number of attacks/moves PyPy must take to kill this Hydra. If it was impossible, prints -1.
            if(isPossible) { System.out.println(M); }
            else { System.out.println(-1); }


            // Update the test case String for the next test case
            testCase = sc.nextLine();
        }

    }
}