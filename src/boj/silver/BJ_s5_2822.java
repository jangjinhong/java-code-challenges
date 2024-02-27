package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_s5_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = new String[8];
        for(int i = 0; i < 8; i++) num[i] = br.readLine();
        int sum = 0;
        int[] n = new int[8];

        for (int i = 0; i < num.length; i++)
            n[i] = Integer.parseInt(num[i]);
        Arrays.sort(n);

        int[] re = new int[5];
        int cnt = 0;
        for(int i=n.length-1; i>2; i--) {
            sum += n[i];
            re[cnt++] = Arrays.asList(num).indexOf(String.valueOf(n[i])) + 1;

        }
        Arrays.sort(re);
        System.out.println(sum);
        for (int i : re) {
            System.out.print(i + " ");
        }
    }
}
