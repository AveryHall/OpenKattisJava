/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/herman
 *
 * Herman
 */

import java.util.Scanner;
public class Herman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // The radius of the circle
        int R = Integer.parseInt(sc.nextLine());

        // Area of circle using Euclidian Geometry
        System.out.println(Math.PI * Math.pow(R, 2));

        // Area of circle using Taxicab Geometry
        System.out.println(2*Math.pow(R, 2));

        // Quick note: to understand this problem visit: https://en.wikipedia.org/wiki/Taxicab_geometry
        // In taxicab geometry, a circle is really a diamond, due to the definition of a circle and the
        // new distance function. Since D(T1, T2) = |x1 - x2| + |y1 - y2| in taxicab geometry and R must
        // remain constant, |x1 - x2| must increase when |y1 - y2| decreases, and vice versa. For a "circle"
        // this forms a square rotated 45* and side length sqrt(2)R.

    }
}