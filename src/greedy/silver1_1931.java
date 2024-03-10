package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class silver1_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });

        System.out.println(Arrays.deepToString(arr));

        /**
         * [회고]
         * 정렬 후, 첫번째에 위치한 회의는 무조건 넣는다고 생각하여
         * cnt = 1, end = arr[0][1]로 잡고 반복문을 실행하게 했다.
         * 하지만 for문을 0~n-1까지 반복하므로, 0으로 초기화하는 것이 바람직.
         * 아니면 for문을 1~n-1까지 설정해주어도 됨.
         */
        int cnt = 0, end = 0;
        for(int i = 0; i < n; i++) {
            if(end <= arr[i][0]) {
                cnt++;
                end = arr[i][1];
            }
        }

        System.out.println(cnt);
    }
}
