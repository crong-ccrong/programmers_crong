class Solution {
    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            answer += (order%10==3) ? 1 : (order%10==6) ? 1 : (order%10==9) ? 1 : 0;
            order /= 10;
        }
        return answer;
    }
}