package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1543_boj {
    /**
     * 메모리: 14356 KB
     *  시간: 136 ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String find = br.readLine();
        int cnt = 0;

        for (int i = 0; i <= str.length()- find.length(); i++) {
            boolean ch = true;
            for (int j = 0; j < find.length(); j++) {
                if (str.charAt(i + j) != find.charAt(j)) {
                    ch = false;
                    break;
                }
            }

            if (ch) {
                cnt++;
                i += find.length() - 1;
            }
        }

        System.out.println(cnt);
    }
}
