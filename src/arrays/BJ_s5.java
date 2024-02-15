package arrays;

import java.io.*;
import java.util.Arrays;

public class BJ_s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] set = new int[11];

        while(n > 0) {
            int dg = n % 10;
            if(dg == 6 || dg == 9) set[9]++;
            else set[dg]++;
            n /= 10;
        }
        set[9] = set[9] / 2 + set[9] % 2;

        Arrays.sort(set);
        System.out.println(set[set.length-1]);
    }
}
