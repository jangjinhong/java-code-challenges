package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class silver5_10815 {
    /** 2번 풀이보다 더 효율적임
     * boj 10815
     * 메모리: 121340 KB
     * 시간: 928 ms
     * 코드길이: 921 B
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> cards = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++)
            cards.put(st.nextToken(), 0);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if(cards.get(st.nextToken()) != null)
                sb.append("1 ");
            else sb.append("0 ");
        }

        System.out.println(sb);
    }
}
