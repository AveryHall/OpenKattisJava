/**
 * Avery Hall
 * 5/23/2018
 * https://open.kattis.com/problems/apaxiaaans
 *
 * Apaxiaaans
 */

import java.util.Scanner;
public class Apaxiaaans {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder compactNameBuilder = new StringBuilder();

        String apaxianName = sc.nextLine();

        char prevChar = ' ';
        for(char c : apaxianName.toCharArray()) {

            if(c != prevChar) {
                prevChar = c;
                compactNameBuilder.append(c);
            }

        }

        System.out.println(compactNameBuilder.toString());

    }
}