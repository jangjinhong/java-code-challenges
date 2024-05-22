package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q12845_boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] input = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(input, Comparator.reverseOrder());

        int gold = 0;
        for (int i = 1; i < N; i++) {
            gold += input[i] + input[0];
        }

        System.out.println(gold);
    }
}
