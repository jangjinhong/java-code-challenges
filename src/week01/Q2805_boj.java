package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2805_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) trees[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(trees);
        int start = 0, end = trees[n - 1];

        while (start < end) {
            int mid = (start + end) / 2;
            long len = 0;

            for (int t : trees) {
                if(t - mid > 0)
                    len += (t - mid);
            }

            if(len < m)
                end = mid;
            else
                start = mid + 1;
        }

        System.out.println(start - 1);
    }
}