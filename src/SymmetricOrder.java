/**
 * Avery Hall
 * 5/24/2018
 * https://open.kattis.com/problems/symmetricorder
 *
 * Symmetric Order
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class SymmetricOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<String> stack = new ArrayDeque<>();
        int setNum = 1;

        int n = Integer.parseInt(sc.nextLine());
        while( n != 0) {

            System.out.println("SET " + setNum);

            int m = 0;

            for (int i = 0; i < n; i++) {

                String name = sc.nextLine();

                // directly output the next String if the index is even (that means it's the first in the pair)
                if(i % 2 == 0) {
                    System.out.println(name);
                } else { // else, the name is the second in the pair and is printed in reverse order at the end
                    m++;
                    stack.push(name);
                }

            }

            for(int j = 0; j < m; j++) {

                System.out.println(stack.pop());

            }

            n = Integer.parseInt(sc.nextLine());
            setNum++;
        }

    }
}