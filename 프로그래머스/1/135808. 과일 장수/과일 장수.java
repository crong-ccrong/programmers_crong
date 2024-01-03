import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        String[] arr = new String[score.length];
        
        // 점수 순으로 정렬
        for (int i=0; i<score.length; i++) {
            arr[i] = score[i]+"";
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 점수 계산
        for (int i=1; i<=score.length/m; i++) {
            answer += m*Integer.parseInt(arr[i*m-1]);
        }
        return answer;
    }
}