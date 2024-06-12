package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15658_boj {
    /**
     * 메모리: 16872 KB
     *  시간: 156 ms
     */
    static int N;
    static int[] op = new int[4];
    static int[] num;
    static int MAX = Integer.MIN_VALUE; //MAX를 가장 작은 수로 초기화
    static int MIN = Integer.MAX_VALUE; //MIN을 가장 큰 수로 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++)
            op[i] = Integer.parseInt(st.nextToken());

        dfs(1, num[0]);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int d, int result) {
        if (d == N) {
            MAX = Math.max(MAX, result);
            MIN = Math.min(MIN, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                switch (i) {
                    case 0:
                        dfs(d + 1, result + num[d]);
                        break;
                    case 1:
                        dfs(d + 1, result - num[d]);
                        break;
                    case 2:
                        dfs(d + 1, result * num[d]);
                        break;
                    case 3:
                        dfs(d + 1, result / num[d]);
                        break;
                }
                op[i]++;    // 사용 후 다시 복구
            }
        }

    }
}
