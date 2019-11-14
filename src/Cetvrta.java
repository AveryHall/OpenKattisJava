/**
 * Avery Hall
 * 5/22/2018
 * https://open.kattis.com/problems/cetvrta
 *
 * Cetvrta
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Cetvrta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Gather input for (x0,y0), (x1,y1), (x2,y2), and (x3,y3)
        HashMap<String, Integer> Xs = new HashMap<>();
        HashMap<String, Integer> Ys = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            String x = sc.next();
            String y = sc.next();

            if (!Xs.containsKey(x)) {
                Xs.put(x, 1);
            } else {
                Xs.put(x, Xs.get(x) + 1);
            }

            if (!Ys.containsKey(y)) {
                Ys.put(y, 1);
            } else {
                Ys.put(y, Ys.get(y) + 1);
            }
        }

        //Output the final point (x4,y4), which is identical to the least occurring x and y values
        for (Map.Entry entry : Xs.entrySet()) {
            if ((int) entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
                break;
            }
        }

        for (Map.Entry entry : Ys.entrySet()) {
            if ((int) entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}