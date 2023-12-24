class Solution {
    public int[] solution(int n) {
        int m = (n%2==0) ? n/2 : n/2+1;
        int[] answer = new int[m];
        int j = 1;
        
        for (int i=0; i<m; i++) {
            answer[i] = j;
            j = j+2;
        }
        return answer;
    }
}