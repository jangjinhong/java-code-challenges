package arrays;

import java.util.Scanner;

public class BJ_b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[201];

        for(int i=0; i<n; i++) {
            nums[sc.nextInt()+100]++;
        }

        System.out.println(nums[sc.nextInt()+100]);
    }
}
