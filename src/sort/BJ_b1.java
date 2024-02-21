package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_b1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++)
            arr[Integer.parseInt(br.readLine())]++;

        for (int i = 0; i < arr.length; i++) {
            while(arr[i]-- > 0)
                System.out.println(i);
        }

    }
}
