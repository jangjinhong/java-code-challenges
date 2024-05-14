package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2667_boj {
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> result = new LinkedList<>();
    static int N, cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cnt = 1;
        map = new int[N][N];
        visited = new boolean[N][N];

        //숫자를 문자열로 받은 뒤, 하나씩 잘라서 넣어줌
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    result.add(cnt);
                    cnt = 1;
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());  //총 단지수
        for(int r : result) {
            System.out.println(r);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {   // 상하좌우
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                cnt++;
                dfs(nx, ny);    //인접
            }
        }
    }
}
