package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        int[] sum = new int[N];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            time[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(time);
        result = sum[0] = time[0];
        for (int i = 1; i < time.length; i++) {
            sum[i] = time[i] + sum[i - 1];
            result += sum[i];
        }
        System.out.println(result);
    }
}
