import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 점수 순으로 정렬
        Arrays.sort(score);
        
        // 점수 계산
        for (int i=(score.length%m); i<score.length; i+=m) {
            answer += m * score[i];
        }
        return answer;
    }
}