package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q10610_boj {
    /**
     * 메모리: 34048 KB
     *  시간: 1096 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int sum = 0;
        boolean zero = false;
        Arrays.sort(str, Collections.reverseOrder());

        for (String s : str) {
            int n = Integer.parseInt(s);
            sum += n;
            if(n == 0) zero = true;
        }

        if (zero && sum % 3 == 0) {
            for (String s : str) {
                System.out.print(s);
            }
        }
        else System.out.println(-1);
    }
}
