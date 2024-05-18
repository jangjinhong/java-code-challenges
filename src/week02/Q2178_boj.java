package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178_boj {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        visited[0][0] = true;
        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<spot> queue = new LinkedList<>();
        queue.offer(new spot(x, y));

        while (!queue.isEmpty()) {
            spot poll = queue.poll();
            int pX = poll.x;
            int pY = poll.y;

            for (int i = 0; i < 4; i++) {
                int nX = dx[i] + pX;
                int nY = dy[i] + pY;

                /** 제약조건
                 * 1. 범위 내에 없으면 안 됨
                 * 2. 막힌 곳이면 안 됨
                 * 3. 방문 한 곳은 갈 필요 없음
                 */
                if (nX < 0 || nY < 0 || nX >= N || nY >= M) {
                    continue;
                }
                if (visited[nX][nY] || map[nX][nY] == 0) {
                    continue;
                }
                queue.offer(new spot(nX, nY));
                map[nX][nY] = map[poll.x][poll.y] + 1;
                visited[nX][nY] = true;
            }

        }
    }
}

class spot {
    int x;
    int y;
    spot(int x, int  y) {
        this.x = x;
        this.y = y;
    }
}