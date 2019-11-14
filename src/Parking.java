/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/parking2
 *
 * Parking
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Parking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // For each test case...
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++) {


            // Sum the values of the store locations and save each store location in an ArrayList
            int sum = 0;
            ArrayList<Integer> Stores = new ArrayList<>();
            int n = Integer.parseInt(sc.nextLine());
            for(int j = 0; j < n; j++) {
                int storeLoc = Integer.parseInt(sc.next());
                sum += storeLoc;
                Stores.add(storeLoc);
            }

            // Find the optimal parking spot (it's the average of the store locations rounded)
            int optimalParkingSpot = Math.round((float)(sum / n));
            Stores.add(optimalParkingSpot);
            Collections.sort(Stores);


            // Calculate the minimal path
            int minPath = optimalParkingSpot - Stores.get(0);
            int prevStop = Stores.get(0);
            for(int j = 1; j < Stores.size(); j++) {
                int currentStop = Stores.get(j);
                minPath += currentStop - prevStop;
                prevStop = currentStop;
            }
            minPath += prevStop - optimalParkingSpot;

            //Remove \n char at end of current line (for the next test case)
            sc.nextLine(); //trash token

            //Output the minimal path
            System.out.println(minPath);

        }

    }
}