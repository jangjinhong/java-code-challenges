package boj.easy;

import java.util.Scanner;

public class Problem2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++)
            System.out.println(" ".repeat(N-i) + "*".repeat(i));

        /*
        for (int i =1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++)
                System.out.print(" ");
            for (int j = N-i+1; j <= N; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = new java.util.Scanner(System.in).nextInt(), n = 1; i > 0; i--)
            System.out.println(" ".repeat(i-1) + "*".repeat(n++));
         */
    }
}
