class Solution {
    public int solution(int n) {
        int answer = 0;
        int multiple = 1;
        while (multiple <= n) {
            multiple *= ++answer;
        }
        return answer-1;
    }
}