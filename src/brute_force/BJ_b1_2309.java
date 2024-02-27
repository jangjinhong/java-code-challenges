package brute_force;

import java.util.*;

public class BJ_b1_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[9];

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            t[i] = sc.nextInt();
            sum += t[i];
        }

        for(int i=0; i<9-1; i++) {
            for (int j=i+1; j<9; j++) {
                if(sum - t[i] - t[j] == 100) {
                    t[i] = t[j] = 0;
                    Arrays.sort(t);
                    for (int k = 2; k < 9; k++) System.out.println(t[k]);
                    return;
                }
            }
        }
    }
}
