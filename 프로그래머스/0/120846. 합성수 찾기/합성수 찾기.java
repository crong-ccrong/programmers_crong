class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            for (int j=2; j*j<=i; j++) {
                if (i%j == 0 && i/j != 1) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}