package greedy;

import java.util.*;

public class basic01 {
    public static void main(String[] args) {
        Integer[] coins = {500, 100, 50, 10};
        int money = 1260;
        Integer cnt = 0;
        Map<Integer, Integer> result = new HashMap<>();

        //1. 선택 절차: 가장 큰 동전부터 선택
        Arrays.sort(coins, Comparator.reverseOrder());

        //2. 적절성 검사: 선택한 동전 > 거스름돈? -> 다음으로 작은 동전 선택
        for (int i = 0; i < coins.length; i++) {
            cnt += money / coins[i];
            money %= coins[i];
            result.put(coins[i], cnt);
        }

        //3. 해답 검사
        if (money == 0)
            System.out.println(result);
    }
}
