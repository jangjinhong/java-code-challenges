package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650_boj {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;
    static int[] nums;
    static int N;
    static int M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N]; // 1~N만큼 돌지롱
        nums = new int[M];      // 수열 M개 필요하지롱
        dfs(0, 0);

        System.out.println(sb);
    }

    static void dfs(int d, int s) {
        // 조건 만족했다면 출력값 저장~!
        if (d == M) {
            for (int n : nums)
                sb.append(n).append(" ");
            sb.append("\n");
            return;
        }

        // 시작점부터 방문하지 않은 수열을 탐색
        for (int i = s; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                nums[d] = i + 1;
                dfs(d + 1, i + 1);
                visit[i] = false;
            }
        }
    }

}
