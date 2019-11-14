/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/oddmanout
 *
 * Odd Man out
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class OddManOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N is the number of test cases. For each test case...
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {

            System.out.print("Case #" + (i+1) + ": ");
            HashMap<Integer, Integer> InviteCodes = new HashMap<>();

            // G is the number of guests. For each guest..
            int G = Integer.parseInt(sc.nextLine());
            for(int j = 0; j < G; j++) {

                //Each int C is the invitation code of a guest
                int C = Integer.parseInt(sc.next());

                if(InviteCodes.containsKey(C)) {
                    InviteCodes.put(C, 2);
                } else {
                    InviteCodes.put(C, 1);
                }

            }

            for(Map.Entry<Integer, Integer> entry : InviteCodes.entrySet()) {
                if(entry.getValue() == 1) { System.out.println(entry.getKey());  break; }
            }

            //Remove trash token for next case
            sc.nextLine();

        }

    }
}