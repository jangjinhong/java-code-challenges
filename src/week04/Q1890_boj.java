package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1890_boj {
    /**
     * 메모리: 14292 KB
     *  시간: 128 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        long[][] dp = new long[N][N];  // 경로 저장

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1; // 시작점 1

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == N - 1 && j == N - 1) continue; // 도착점 제외
                int dist = map[i][j]; // 현재 칸에서 이동할 수 있는 거리
                if (i + dist < N) dp[i + dist][j] += dp[i][j]; // 아래쪽
                if (j + dist < N) dp[i][j + dist] += dp[i][j]; // 오른쪽
            }
        }

        System.out.println(dp[N - 1][N - 1]);
    }
}
