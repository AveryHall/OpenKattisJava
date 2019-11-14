/**
 * Avery Hall
 * 5/23/2018
 * https://open.kattis.com/problems/humancannonball2
 *
 * The Amazing Human Cannonball
 */

import java.util.Scanner;
public class HumanCannonball {

    //Use the two formulas to solve the problem:
    // 1) x(t) = v0 * t * cos(theta)
    // 2) y(t) = v0 * t * sin(theta) - 1/2 * g * t

    private static double g = 9.81;

    public static void main(String[] args) {

        // Initialize scanner
        Scanner sc = new Scanner(System.in);

        // Gather the number of test cases
        int N = Integer.parseInt(sc.next());

        // For each test case...
        for(int i = 0; i < N; i++) {

            // Gather input for v0, theta, x1, h1, and h2
            double v0 = Double.parseDouble(sc.next());      // Initial velocity
            double theta = (Double.parseDouble(sc.next()) * Math.PI) / 180;   // Angle of trajectory
            double x1 = Double.parseDouble(sc.next());      // Distance from cannon to walls
            double h1 = Double.parseDouble(sc.next());      // Height of lower wall
            double h2 = Double.parseDouble(sc.next());      // Height of start of upper wall

            // Use eq. 1 to solve for t, that is, the t when the cannonball is at position x1
            double t = x1 / (v0 * Math.cos(theta));

            // Then solve y(t) at t and check that y is within the safety parameters (1 meter from center)
            double yt = v0 * t * Math.sin(theta) - 0.5 * g * Math.pow(t, 2);

            // Check
//            System.out.println(v0);
//            System.out.println(theta);
//            System.out.println(x1);
//
//            System.out.println();
//            System.out.println(v0 * Math.cos(theta));
//            System.out.println();
//
//            System.out.println(t);
//            System.out.println(yt);

            if(yt <= h2 - 1 && yt >= h1 + 1) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }

        }

    }
}