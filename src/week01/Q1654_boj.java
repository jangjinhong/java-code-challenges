package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1654_boj {
    /**
     * 메모리: 17508 KB
     *  시간: 200 ms
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); //이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수
        long[] lan = new long[K];

        for (int i = 0; i < K; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lan);

        long start = 0, end = Integer.MAX_VALUE;
        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            int cnt = 0;

            for (int i = 0; i < K; i++)
                cnt += (int) (lan[i] / mid);

            if(cnt < N)
                end = mid - 1;
            else {
                start = mid + 1;
                result = Math.max(result, mid);
            }
        }

        System.out.println(result);
    }
}
