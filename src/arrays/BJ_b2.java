package arrays;

import java.util.Scanner;

public class BJ_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];
        int mul = sc.nextInt() * sc.nextInt() * sc.nextInt();

        while(mul > 0){
            result[mul % 10]++;
            mul /= 10;
        }
        for (int r : result) System.out.println(r);
    }
}
