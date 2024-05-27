package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q12026_boj {
    /**
     * 메모리: 14376 KB
     *  시간: 144 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String block = br.readLine();
        int[] DP = new int[N];
        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[0] = 0;

        for (int i = 0; i < DP.length; i++) {
            if (DP[i] == Integer.MAX_VALUE) continue; // 도달 불가능한 블록은 연산 안 함
            char next = getNextBlock(block.charAt(i));
            for (int j = i + 1; j < DP.length; j++) {
                if (block.charAt(j) == next) {
                    DP[j] = Math.min(DP[j], DP[i] + (j - i) * (j - i));
                }
            }
        }

        System.out.println(DP[N - 1] == Integer.MAX_VALUE ? -1 : DP[N - 1]);
    }

    static char getNextBlock(char current) {
        switch (current) {
            case 'B':
                return 'O';
            case 'O':
                return 'J';
            case 'J':
                return 'B';
            default:
                return ' ';
        }
    }
}
