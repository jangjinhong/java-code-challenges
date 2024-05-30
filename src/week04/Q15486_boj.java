package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15486_boj {
    /**
     * 메모리: 310192 KB
     *  시간: 724 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];
//        int[][] consult = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int[] DP = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            if (i + T[i] <= N + 1) {
                DP[i + T[i]] = Math.max(DP[i + T[i]], DP[i] + P[i]);
            }
            DP[i + 1] = Math.max(DP[i + 1], DP[i]);
        }

        int result = 0;
        for (int i = 1; i <= N + 1; i++) {
            result = Math.max(result, DP[i]);
        }

        System.out.println(result);
    }
}
