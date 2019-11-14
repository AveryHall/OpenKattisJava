/*
Avery Hall
CS 1233-1
2/3/16
"Calendar"
*/


public class Calendar {
    //MAIN FUNCTION
    public static void main(String [] args) {

        //PRE-STEP: VARIABLES
        //Initializes variables for month, (first) day, and year of calendar
        int m = Integer.parseInt(args[0]);
        int d = 1;
        int y = Integer.parseInt(args[1]);

        //Initializes variables for the number of days in a given month, name of month, and leap year
        int numDaysInMonth = 0;
        String monthName = "";
        boolean isLeapYear = false;

        //Initializes variables for day of week calculation (y0, x, m0, d0), and initial indentation of calendar
        int y0 = 0;
        int x = 0;
        int m0 = 0;
        int d0 = 0;
        String calendarLineIndent = "";

        //Initializes variable for each calendar line and the calendar spacing between days (determined by whether the day number is a single or double digit number)
        String calendarLine = "";
        String calendarSpacing = "";


        //Step 1: SWITCH CASE -- DETERMINES MONTH NAME, NUMBER OF DAYS IN MONTH, AND LEAP YEAR CONDITION (February only)
        switch (m) {

            //January case
            case 1:

                monthName = "January";     //Sets monthName to "January"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //February case
            case 2:

                monthName = "February";    //Sets monthName to "February"

                //Determines if entered year is a leap year
                if ( ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0) ) {
                    isLeapYear = true;     //If so, isLeapYear is set to true
                }
                else {
                    isLeapYear = false;    //Else, isLeapYear is set to false
                }
                if (isLeapYear == true) {
                    numDaysInMonth = 29;   //Sets numDaysInMonths to 29 if isLeapYear is true
                }
                else {
                    numDaysInMonth = 28;   //Sets numDaysInMonths to 28 if isLeapYear is false
                }

                break;

            //March case
            case 3:

                monthName = "March";       //Sets monthName to "March"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //April case
            case 4:

                monthName = "April";       //Sets monthName to "April"
                numDaysInMonth = 30;       //Sets numDaysInMonths to 30
                break;

            //May case
            case 5:

                monthName = "May";         //Sets monthName to "May"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //June case
            case 6:

                monthName = "June";        //Sets monthName to "June"
                numDaysInMonth = 30;       ////Sets numDaysInMonths to 30
                break;

            //July case
            case 7:

                monthName = "July";        //Sets monthName to "July"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //August case
            case 8:

                monthName = "August";      //Sets monthName to "August"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //September case
            case 9:

                monthName = "September";   //Sets monthName to "September"
                numDaysInMonth = 30;       //Sets numDaysInMonths to 30
                break;

            //October case
            case 10:

                monthName = "October";     //Sets monthName to "October"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;

            //November case
            case 11:

                monthName = "November";    //Sets monthName to "November"
                numDaysInMonth = 30;       //Sets numDaysInMonths to 30
                break;

            //December case
            case 12:

                monthName = "December";    //Sets monthName to "December"
                numDaysInMonth = 31;       //Sets numDaysInMonths to 31
                break;
        }


        //Step 2: DETERMINES DAY OF WEEK OF FIRST DAY OF MONTH (refer to the value of variable d initialized above) AND INITIAL INDENTATION OF CALENDAR

        //Uses given expressions to calculate the day of the week of the first day of the entered month on the entered year
        y0 = y - (14 - m) / 12;
        x = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12 * ( (14 - m) / 12) - 2;
        d0 = (d + x +(31*m0)/12) % 7;

        //Given the day of the week, d0, on which the first day of the month, d, falls on, the appropriate indentation is determined
        if (d0 == 0) {
            calendarLineIndent = "  ";                        //Indentation if first day is on Sunday
        }
        else if (d0 == 1) {
            calendarLineIndent = "     ";                     //Indentation if first day is on Monday
        }
        else if (d0 == 2) {
            calendarLineIndent = "        ";                  //Indentation if first day is on Tuesday
        }
        else if (d0 == 3) {
            calendarLineIndent = "           ";               //Indentation if first day is on Wednesday
        }
        else if (d0 == 4) {
            calendarLineIndent = "              ";            //Indentation if first day is on Thursday
        }
        else if (d0 == 5) {
            calendarLineIndent = "                 ";         //Indentation if first day is on Friday
        }
        else {
            calendarLineIndent = "                    ";      //Indentation if first day is on Sunday
        }



        //Step 3: OUTPUT
        //CALENDAR HEADER
        System.out.println("---------------------");       //Header opening line
        System.out.println("    " + monthName + " " + y);  //Prints Full name of month (determined in step 1) and y (from argument input)
        System.out.println("---------------------");       //Header closing line

        //CALENDAR BODY
        System.out.println(" Su Mo Tu We Th Fr Sa");       //Prints day of week header

        //Calculates the calendar
        int i = 1;                                                       //i is a counting variable
        while (i <= numDaysInMonth) {                                       //Outer loop: runs the inner while loop until the line is 21 characters long or until all of the days have been used.

            while((calendarLine.length() < 21) && (i <= numDaysInMonth)) {     //Inner Loop: concatenates a line of the calender together until the line is 21 characters long or until all days have
                //been used.
                if (i == 1) {                                                     //Indents calendar on first run before first day
                    calendarLine += calendarLineIndent + "1";
                }
                else {                                                            //After the first run, formats the rest of the line of the calendar
                    //DETERMINES SPACING BETWEEN DAYS IN CALENDAR
                    if ((i >= 1) && (i <= 9)) {                                   //Two spaces between single-digit days
                        calendarSpacing = "  ";
                    }
                    else if ((i >= 10) && (i <= numDaysInMonth)) {                //One space between double-digit days
                        calendarSpacing = " ";
                    }

                    calendarLine += calendarSpacing + i;                          //The days are added to a line of text until the line is complete
                }
                i++;                                                           //Counting variable iterates
            }

            System.out.print(calendarLine);                                 //Prints the most recent line generated by the inner loop
            System.out.println("");                                         //Ends the line wih a newline character
            calendarLine = "";                                              //Sets the length of the calendarLine to 0 for the next run
        }

        System.out.println("---------------------");     //Calendar closing line
    }
}
