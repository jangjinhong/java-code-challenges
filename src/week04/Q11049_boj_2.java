package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11049_boj_2 {
    /**
     * 메모리: 17800 KB
     *  시간: 324 ms
     */

    static int[][] dp;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1; // 계산되지 않은 값은 -1로 표시
            }
        }

        System.out.println(matrixChainOrder(0, N - 1));
    }

    private static int matrixChainOrder(int i, int j) {
        // 행렬이 한 개일 때 횟수는 0
        if (i == j) {
            return 0;
        }

        // 이미 계산된 경우 저장된 값을 반환
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // 가능한 모든 분할에 대한 계산 시도
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            /** i~j 사이 가능한 분할 k에 대해 두 하위 체인의 곱의 횟수, 두 행렬의 곱의 횟수를 재귀적으로 계산 */
            int cost = matrixChainOrder(i, k) + matrixChainOrder(k + 1, j) + map[i][0] * map[k][1] * map[j][1];

            if (cost < minCost) {
                minCost = cost;
            }
        }

        // 최소 비용 저장하여 반환
        dp[i][j] = minCost;

        return dp[i][j];
    }
}
