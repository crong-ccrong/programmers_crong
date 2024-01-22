class Solution {
    public long solution(int n) {
        long answer = 1;
        long before = 1;
        long temp = 0;
        for (int i=2; i<=n; i++) {
            temp = answer;
            answer = (answer + before) % 1234567;
            before = temp;
        }
        return answer;
    }
}