import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        // A는 오름차순 정렬, B는 내림차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length-1-i];
        }
        return answer;
    }
}