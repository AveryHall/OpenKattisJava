/**
 * Avery Hall
 * 5/22/2018
 * https://open.kattis.com/problems/Bela
 *
 * Bela
 */

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
public class Bela {

    private static HashMap<String, Integer> Table = new HashMap<>();
    static {

        Table.put("AD", 11);
        Table.put("AN", 11);
        Table.put("KD", 4);
        Table.put("KN", 4);
        Table.put("QD", 3);
        Table.put("QN", 3);
        Table.put("JD", 20);
        Table.put("JN", 2);
        Table.put("TD", 10);
        Table.put("TN", 10);
        Table.put("9D", 14);
        Table.put("9N", 0);
        Table.put("8D", 0);
        Table.put("8N", 0);
        Table.put("7D", 0);
        Table.put("7N", 0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numHands = Integer.parseInt(sc.next());
        String domSuit = sc.next();
        String trash = sc.nextLine();

//        System.out.println(numHands);
//        System.out.println(domSuit);

        int totalPoints = 0;
        for(int i = 0; i < 4*numHands; i++) {

            String card = sc.nextLine();
            String cardval = card.charAt(0) + "";
            String suit = card.charAt(1) + "";

//            System.out.println(cardval);
//            System.out.println(suit);

            if(suit.equals(domSuit)) {
                totalPoints += Table.get(cardval+"D");
//                System.out.println(Table.get(cardval + "D"));
            } else {
                totalPoints += Table.get(cardval+"N");
//                System.out.println(Table.get(cardval + "N"));
            }

        }

        System.out.println(totalPoints);

    }
}