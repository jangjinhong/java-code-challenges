//package brute_force;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BJ_s3_15655 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
//
//        Arrays.sort(nums);
//        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
//        int cnt = 1;
//        for(int i = 0; i<n-1; i++) {
//            System.out.println("=========================");
//            System.out.print(nums[i] + " ");
//            if(cnt != m) {
//                int cnt2 = 1;
//                for (int j = i + 1; j < n; j++) {
//                    if(cnt2 == m) {
//                        System.out.println();
//                        System.out.print(nums[i] + " ");
//                    }
//                    System.out.print(nums[j] + " ");
//                    cnt2++;
////                if(cnt >= m) {
////                    System.out.println();
////                    System.out.print(nums[i] + " ");
////                }
////                System.out.print(nums[j] + " ");
////                cnt++;
//
//                }
//                System.out.println();
//            }
//        }
//    }
//}
