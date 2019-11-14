/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/epigdanceoff
 *
 * EpigDanceOff: This program counts the number of "dance moves" in a series of frames by "counting" the number of
 * frames in the dance. Frames are always denoted by one and only one column of '_' characters. There is never an empty
 * frame at the beginning or ending of the video, so edge cases do not have to be accounted for. Thus, we simply need
 * to count up the number of columns containing only '_' characters. We can assume that because there will never be an
 * empty frame that there will always be at least one dance move.
 */

import java.util.Scanner;
public class EpigDanceOff {

    // MAIN FUNCTION: Will run our program
    public static void main(String[] args) {

        //Creates a Scanner object, sc, to read in input using default input
        Scanner sc = new Scanner(System.in);

        //Initialize variables. Boolean endOfFrame notes whether a suspected column of input is known to be a potential
        //blank column or not. N is the number of lines in the frame, and M is the number of characters in each line.
        //T the total score for the dance submission based on the number of frames counted in the submission. DanceMoves
        //contains the dance submission as a 2-dimensional array of characters.
        boolean endOfFrame = true;
        int N = Integer.parseInt(sc.next());                //Read in the number of rows
        int M = Integer.parseInt(sc.nextLine().trim());     //Read in the number of characters per row
        int T = 1;
        char[][] DanceMoves = new char[N][M];

        //Read in the characters one row at a time. Constructs DanceMoves 2-D array.
        for(int i = 0; i < N; i++) { DanceMoves[i] = sc.nextLine().toCharArray(); }

        //Search for end of frames in order to count the number of frames in the submission.
        for(int j = 0; j < M; j++) {
            if(DanceMoves[0][j] == '_') {                       //if the first line contains a '_' in the current column:
                endOfFrame = true;                                      //assume it's an end of frame
                for (int i = 1; i < N-1; i++) {                                     //searches middle of column to verify
                    if(DanceMoves[i][j] != '_') { i = N-1; endOfFrame = false; }    //assumption. If false, stops search
                }                                                                   //and moves to the next line.
                if(DanceMoves[N-1][j] == '_') { if(endOfFrame) {T++;}}  //add 1 to total if this column was end of frame.
            }
        }

        //Output the total
        System.out.println(T);

    }
}
