package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14465_boj {
    /**
     * 메모리: 14280 KB
     * 시간: 132 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] V = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            V[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] DP = new boolean[N + 1][M + 1];
        DP[0][S] = true;

        int result = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                if (DP[i][j]) {
                    if (j + V[i] <= M)
                        DP[i + 1][j + V[i]] = true;
                    if (0 <= j - V[i])
                        DP[i + 1][j - V[i]] = true;
                }
            }
        }

        for (int j = M; j >= 0; j--) {
            if (DP[N][j]) {
                result = Math.max(result, j);
                break;
            }
        }

        System.out.println(result);
    }
}
