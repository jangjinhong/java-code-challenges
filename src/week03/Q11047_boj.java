package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11047_boj {
    /**
     * 메모리 14232 kB
     * 시간 132 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] coin = new Integer[N];

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += K / coin[i];
            K %= coin[i];
        }

        System.out.println(result);
    }
}
