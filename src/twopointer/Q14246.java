package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        int start = 0, end = 0;  //i,j
        long cnt = 0, sum = 0;
        while(true) {
            /**
             * 1. sum > k의 경우,
             *      1.1. cnt를 구한다.(start ~ end까지의 구간합 원소 개수가 포함된다.)
             *      1.2. sum > k여서 다시 계산이 필요하므로,
             *           sum 값의 맨 앞 원소만 제거하여 다시 진행
             * 2. sum <= k의 경우, 2가지 case가 존재
             *      2.1. sum == k을 충족한 경우
             *           다음에 break 걸림
             *      2.2. sum < k여서 추가 계산이 필요한 경우
             *           end를 늘려 추가 계산 진행
             */
            if(sum > k) {
                System.out.println("start = " + start);
                System.out.println("end = " + end);
                cnt += n - end + 1;
                sum -= nums[start++];
            } else if(end == n) break;
            else {
                sum += nums[end++];
            }
        }

        System.out.println(cnt);
    }
}
