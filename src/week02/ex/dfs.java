package week02.ex;

public class dfs {
    public final static int GRAPH_LIST_SIZE = 9;
    public static boolean[] visited = new boolean[GRAPH_LIST_SIZE];
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args) {
        dfs(1);
    }

    // DFS 탐색을 위한 재귀함수
    public static void dfs(int node){
        // 현재 노드 방문 처리
        visited[node] = true;
        System.out.print(node + " ");

        // 인접 노드 방문
        for(int n : graph[node]){
            if(!visited[n]){
                dfs(n);
            }
        }
    }
}
