package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260_boj {
    static boolean[] visited;
    static int[][] graph;
    static Queue<Integer> queue = new LinkedList<>();
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 노드 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // start node

        graph = new int[1001][1001];
        visited = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int g1 = Integer.parseInt(st.nextToken());
            int g2 = Integer.parseInt(st.nextToken());
            //양방향
            graph[g1][g2] = graph[g2][g1] = 1;
        }

        dfs(V);
        System.out.println();

        Arrays.fill(visited, false); // 0으로 전체 초기화
        bfs(V);
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i <= N; i++) {
            if (graph[node][i] == 1 && !visited[i]) //방문 안 한 노드
                dfs(i);
        }
    }

    public static void bfs(int node) {
        queue.offer(node);
        visited[node] = true;
        System.out.print(node + " ");

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            for (int i = 0; i < graph.length; i++) {
                if (graph[poll][i] == 1 && !visited[i]) { //방문 안 한 노드
                    visited[i] = true;
                    queue.offer(i);
                    System.out.print(i + " ");
                }
            }
        }
    }

}
