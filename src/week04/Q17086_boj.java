package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q17086_boj {
    /**
     * 메모리: 14592 KB
     * 시간: 140 ms
     */
    static int N, M;
    static int[][] map;
    static Queue<int[]> queue = new LinkedList<>(); // 2D
    // 상하좌우 대각
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        System.out.println(BFS() - 2); //거리가 2부터 시작임
    }

    public static int BFS() {
        int result = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            result++;

            for (int k = 0; k < size; k++) {
                int[] now = queue.poll();

                for (int i = 0; i < 8; i++) {
                    int nextX = now[0] + dx[i];
                    int nextY = now[1] + dy[i];

                    if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && map[nextX][nextY]!=1) {
                        int distance = Math.abs(nextX - now[0]) + Math.abs(nextY - now[1]);
                        result = Math.max(result, distance);
                        map[nextX][nextY] = 1;
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }
        }

        return result;
    }
}

