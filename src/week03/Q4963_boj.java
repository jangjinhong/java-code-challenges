package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4963_boj {
    static int W;
    static int H;
    static StringBuilder sb;
    static int cnt;
    static boolean[][] visit;
    static int[][] island;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        sb = new StringBuilder();

        W = 1; //Integer.parseInt(st.nextToken());
        H = 1; //Integer.parseInt(st.nextToken());

        if (W == 0 && H == 0) {
            System.out.println(sb);
        }
        else {
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            visit = new boolean[W][H];
            island = new int[W][H];

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    st = new StringTokenizer(br.readLine());
                    island[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dfs(W, H, 0);
        }
    }


    static void dfs(int W, int H, int depth) {
        if (depth == H) {
            sb.append(cnt).append("\n");
            return;
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (!visit[i][j]) {
                    visit[i][j] = true;
                    if (island[i][j+1] == 1) {
                        if (island[i][j + 1 + 1] == 1) {
                            if (island[i][j + 1 + 1 = 1] != 1) {    //여긴 바다
                                그러면 islang[i+1][0]부터 다시 이를 반복
                            }
                        }
                    }
                }

            }
        }

    }
}
