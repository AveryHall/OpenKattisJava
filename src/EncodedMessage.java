/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/encodedmessage
 *
 * Encoded Message
 */

import java.util.Scanner;
public class EncodedMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < t; i++) {

            StringBuilder decoder = new StringBuilder();
            String encodedMsg = sc.nextLine();
            int squareLength = (int) Math.sqrt(encodedMsg.length());

            for(int j = squareLength - 1; j >= 0; j--) {
                for(int k = 0; k < squareLength; k++) {
                    decoder.append(encodedMsg.charAt(j+(k*squareLength)));
                }
            }

            System.out.println(decoder.toString());

        }

    }
}