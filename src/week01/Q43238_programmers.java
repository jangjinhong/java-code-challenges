package week01;

import java.util.Arrays;

public class Q43238_programmers {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        long answer = 0;

        Arrays.sort(times);

        // 탐색 대상: "시간"의 범위
        long start = 0, end = (long) times[times.length - 1] * n;

        while (start <= end) {
            long mid = (start + end) / 2;
            long inspec = 0;

            for (int i = 0; i < times.length; i++)
                inspec += mid / times[i]; // mid로 총 몇 명을 심사할 수 있는 가?

            if (inspec < n)
                start = mid + 1;
            else {
                end = mid - 1;
                answer = mid; // 최솟값을 찾기 위해^^
            }

        }

        System.out.println(answer);
    }
}
