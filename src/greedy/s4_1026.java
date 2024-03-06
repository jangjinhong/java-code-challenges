package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class s4_1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] a = new Integer[n], b = new Integer[n];
        int re = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) b[i] = Integer.parseInt(st.nextToken());

        //1. 선택 절차: a는 오름차순, b는 내림차순
        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        //2. 적절성 검사: 인덱스 순서대로 곱하기
        for (int i = 0; i < n; i++)
            re += a[i] * b[i];

        //3. 해답 검사
        System.out.println(re);
    }
}
