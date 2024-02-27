package boj.easy;

import java.util.Scanner;

public class BJ_b5_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        double re = s.length == 1 ? 0.0 : s[1].equals("+") ? + 0.3 : s[1].equals("0") ? 0 : s[1].equals("-") ? -0.3 : 0;
        re += s[0].equals("A") ? 4 : s[0].equals("B") ? 3 : s[0].equals("C") ? 2 : s[0].equals("D") ? 1 : 0;
        System.out.println(re);
    }
}
