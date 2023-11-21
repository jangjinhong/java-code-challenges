package baekjun.easy;

import java.util.*;

public class Problem2562 {
    static final int LIST_MAX_LENGTH = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<LIST_MAX_LENGTH; i++)
            list.add(sc.nextInt());

        Integer max = list
                .stream()
                .max(Comparator.comparing(n->n))
                .orElseThrow(NoSuchFieldError::new);

        System.out.println(max);
        System.out.println(list.indexOf(max)+1);
    }
}
