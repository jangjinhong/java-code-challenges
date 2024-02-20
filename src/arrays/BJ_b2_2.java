package arrays;

import java.util.Scanner;

public class BJ_b2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int cnt = 0;
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            c1[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++)
            c2[str2.charAt(i)-'a']++;

        for (int i = 0; i < 26; i++)
            cnt += Math.abs(c1[i] - c2[i]);

        System.out.println(cnt);
    }
}
