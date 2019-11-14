/**
 * Avery Hall
 * 5/21/2018
 * https://open.kattis.com/problems/datum
 *
 * Datum
 */

import java.util.Scanner;
public class Datum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.next());
        int month = Integer.parseInt(sc.next());

        // 2009 Starting Days of the Week for Each Month
        int startDay = -1;
        switch(month) {

            case 1:
                startDay = 4;
                break;

            case 2:
                startDay = 0;
                break;

            case 3:
                startDay = 0;
                break;

            case 4:
                startDay = 3;
                break;

            case 5:
                startDay = 5;
                break;

            case 6:
                startDay = 1;
                break;

            case 7:
                startDay = 3;
                break;

            case 8:
                startDay = 6;
                break;

            case 9:
                startDay = 2;
                break;

            case 10:
                startDay = 4;
                break;

            case 11:
                startDay = 0;
                break;

            case 12:
                startDay = 2;
                break;
        }

//        System.out.println(startDay);

        //Calculate the day of the week of the input day from that month given the starting day
        int weekday = (startDay + (day - 1)) % 7;

        String Weekday;
        if(weekday == 0) {
            Weekday = "Sunday";
        } else if (weekday == 1) {
            Weekday = "Monday";
        } else if (weekday == 2) {
            Weekday = "Tuesday";
        } else if (weekday == 3) {
            Weekday = "Wednesday";
        } else if (weekday == 4) {
            Weekday = "Thursday";
        } else if (weekday == 5) {
            Weekday = "Friday";
        } else if (weekday == 6){
            Weekday = "Saturday";
        } else {
            Weekday = "ERROR";
        }

        System.out.println(Weekday);

    }
}