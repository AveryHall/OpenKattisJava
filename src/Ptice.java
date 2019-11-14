/**
 * Avery Hall
 * 5/13/2019
 * https://open.kattis.com/problems/ptice
 *
 * Ptice
 */

import java.util.Scanner;
public class Ptice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] AdriansSeq = {'A','B','C'};
        char[] BrunosSeq = {'B','A','B','C'};
        char[] GoransSeq = {'C','C','A','A','B','B'};

        int AdrianCorrect = 0;
        int BrunoCorrect = 0;
        int GoranCorrect = 0;
        int N = Integer.parseInt(sc.nextLine());
        int M = 0;

        char[] Key = sc.nextLine().toCharArray();

        for(int i = 0; i< N; i++) {

            if(Key[i] == AdriansSeq[i%AdriansSeq.length]) {
                AdrianCorrect++;
            } if(Key[i] == BrunosSeq[i%BrunosSeq.length]) {
                BrunoCorrect++;
            } if (Key[i] == GoransSeq[i%GoransSeq.length]) {
                GoranCorrect++;
            }

        }


        if(AdrianCorrect > M) {M = AdrianCorrect;}
        if(BrunoCorrect > M) {M = BrunoCorrect;}
        if(GoranCorrect > M) {M = GoranCorrect;}

        System.out.println(M);

        if(AdrianCorrect == M) {
            System.out.println("Adrian");
        } if (BrunoCorrect == M) {
            System.out.println("Bruno");
        } if (GoranCorrect == M) {
            System.out.println("Goran");
        }

    }
}
