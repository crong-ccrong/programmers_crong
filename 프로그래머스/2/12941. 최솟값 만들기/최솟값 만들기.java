import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        Integer[] C = new Integer[B.length];
        for (int i=0; i<B.length; i++) {
            C[i] = B[i];
        }
        
        // A는 오름차순 정렬, C는 내림차순 정렬
        Arrays.sort(A);
        Arrays.sort(C, Collections.reverseOrder());
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * C[i];
        }
        return answer;
    }
}