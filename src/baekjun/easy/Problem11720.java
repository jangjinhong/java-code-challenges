package baekjun.easy;

import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println(
                sc.nextLine().chars()       // IntStream 문자
                .map(n->n-'0')              // 각 문자를 정수로 변환
                .sum());                    // 합계

        /*
        int N = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < N; i++)
            sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));

        System.out.println(sum);
         */
    }
}
