/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/heartrate
 *
 * Heart Rate
 */

import java.util.Scanner;
public class HeartRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {

            int b = Integer.parseInt(sc.next());
            double p = Double.parseDouble(sc.next());

            double minABPM = 60 * (b-1) / p;
            double BPM = 60 * b / p;
            double maxABPM = 60 * (b+1) / p;

            System.out.println(minABPM + " " + BPM + " " + maxABPM);

        }

    }
}