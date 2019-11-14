/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/beavergnaw
 * Beavergnaw
 */

// Volume of a cylinder: https://www.google.com/search?rlz=1C1SQJL_enUS780US781&ei=0kwOW-mQGIbzzgLA65KQCA&q=volume+of+a+cylinder&oq=volume+of+a+cylinder&gs_l=psy-ab.3..0i67k1j0l9.1591.1591.0.84342.1.1.0.0.0.0.199.199.0j1.1.0....0...1c.1.64.psy-ab..0.1.199....0.YXBUefGNMK0
// Volume of a cone: https://www.google.com/search?q=volume+of+a+cone&rlz=1C1SQJL_enUS780US781&oq=volume+of+a+cone&aqs=chrome..69i57.3864j0j7&sourceid=chrome&ie=UTF-8

import java.util.Scanner;
public class Beavergnaw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Gather input for the first test case
        int D = Integer.parseInt(sc.next());
        int Vremoved = Integer.parseInt(sc.next());

        // Repeat until 0 0 is entered
        while( D != 0 && Vremoved != 0) {

            // First, calculate R from D
            double R = (double)D / 2.0;

            // Then, calculate the remaining Volume once Vremoved is subtracted from the cylinder w/ Volume pi*(R^2)*D
            double Vremain = (Math.PI * Math.pow(R,2) * D) - Vremoved;

            // Finally, calculate d using the formulas for volume of a cylinder and volume of a cone
            // Hint: start with Vremain = 2*(pi*(R^2)*(D/2)/3) + pi*((d/2)^2)*d - 2*(pi*((d/2)^2)*(d/2)/3) and solve
            // for d.
            double d = Math.cbrt(2 * ((3 * Vremain / Math.PI) - (Math.pow(R,2) * D)));

            D = Integer.parseInt(sc.next());
            Vremoved = Integer.parseInt(sc.next());

            System.out.println(d);
        }

    }
}