/**
 * Avery Hall
 * 5/29/2018
 * https://open.kattis.com/problems/kemija08
 *
 * Kemija
 */

import java.util.Scanner;
public class Kemija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder decodedMessage = new StringBuilder();
        String codedMessage = sc.nextLine();

        for(int i = 0; i < codedMessage.length(); i++) {
            char c = codedMessage.charAt(i);
            decodedMessage.append(c);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { i += 2; }
        }

        System.out.println(decodedMessage.toString());

    }
}