package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class silver5_10815_2 {
    /**
     * boj 10815
     * 메모리: 123828 KB
     * 시간: 1432 ms
     * 코드길이: 1311 B
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            cards[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, n, num) + " ");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int[] cards, int n, int target) {
        int low = 0, high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(cards[mid] == target)
                return 1;

            if (cards[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }

        return 0;
    }
}
