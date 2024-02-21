package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class BJ_s5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
