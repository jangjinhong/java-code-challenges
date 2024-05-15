package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012_boj_dfs {
    static int[][] map;
    static boolean[][] visited;
    static int M, N, K, result;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());   //배추밭 가로
            N = Integer.parseInt(st.nextToken());   //배추밭 세로
            K = Integer.parseInt(st.nextToken());   //배추가 심어져 있는 위치의 개수
            result = 0;
            map = new int[M][N];
            visited = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nX = dx[i] + x;
            int nY = dy[i] + y;

            if (nX >= 0 && nY >= 0 && nX < M && nY < N && !visited[nX][nY] && map[nX][nY] == 1) {
                dfs(nX, nY);
            }
        }
    }

}
