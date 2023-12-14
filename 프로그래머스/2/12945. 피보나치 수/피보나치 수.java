class Solution {
    public int solution(int n) {
        int answer = 1;
        int before = 1;
        int temp = 0;
        for (int i=2; i<n; i++) {
            temp = answer;
            answer = (answer + before) % 1234567;
            before = temp;
        }
        return answer;
    }
}