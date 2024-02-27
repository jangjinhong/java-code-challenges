package brute_force;

import java.util.Scanner;

public class BJ_b2_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] card = new int[n];
        for (int i = 0; i < n; i++) card[i] = sc.nextInt();

        int re = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    int t = card[i] + card[j] + card[k];
                    if(t <= m && re < t)
                        re = t;
                }
            }
        }

        System.out.println(re);
        sc.close();
    }
}
