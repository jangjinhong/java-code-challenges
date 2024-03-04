package greedy;

import java.util.Arrays;

public class programmers42862 {
    public static void main(String[] args) {
        int n = 5;      // 학생 수 제한: 2~30까지
        int[] lost = {2, 4};        // 체육복 없는 학생들의 번호 나열
        int[] reserve = {3};  // 여벌 체육복이 있는 학생들의 번호 나열
        int re = n - lost.length; // 체육복 있는 학생 수

        //1. 선택 절차: 오름차순 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //2. 적절성 검사: 분실o 여벌o 학생 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) { // 분실o, 여벌o 학생
                    re++; //스스로가 스스로에게 빌림
                    reserve[j] = -1; //못 빌려줌
                    break;
                }
            }
        }
        
        //3. 해답 검사: 분실o 여벌x 학생에게 빌려줄 수 있는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1) {
                    re++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        System.out.println(re);
    }
}
