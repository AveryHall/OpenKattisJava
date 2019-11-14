/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/estimatingtheareaofacircle
 *
 * Estimating the Area of a Circle
 */

import java.util.Scanner;
public class EstimatingArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("0 0 0")) {

            String[] rmc = input.split(" ");

            double r = Double.parseDouble(rmc[0]);
            int m = Integer.parseInt(rmc[1]);
            int c = Integer.parseInt(rmc[2]);

            double actualArea = Math.PI * Math.pow(r, 2);
            double estimatedArea = ((double)c / (double)m) * Math.pow(r*2, 2);

            System.out.println(actualArea + " " + estimatedArea);

            input = sc.nextLine();

        }

    }
}