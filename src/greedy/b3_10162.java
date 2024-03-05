package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b3_10162 {
    public static void main(String[] args) throws Exception {
        /*
         * 메모리 15932KB
         * 시간 144ms
         * 코드길이 801 B
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        int[] re = new int[3];
        int s = 0;

        //1. 선택 절차:
         int[] btn = {300, 60, 10};

        //2. 적절성 검사:
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn.length; j++) {
                if(t < btn[i]) break;
                re[i] = t / btn[i];
                if(re[i] == 0) break;
                t %= btn[i];
            }
            sb.append(re[i] + " ");
        }

        //3. 해답 검사:
        if(t != 0) System.out.println(-1);
        else System.out.println(sb);

    }
}
