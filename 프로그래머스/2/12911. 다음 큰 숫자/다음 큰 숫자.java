class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = n+1;
        int answerCount = 0;
        for (char c : Integer.toBinaryString(n).toString().toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        while(answerCount != count) {
            for (char c : Integer.toBinaryString(answer).toString().toCharArray()) {
                if (c == '1') {
                    answerCount++;
                }
            }
            if (answerCount == count) {
                break;
            }
            answer++;
            answerCount = 0;
        }
        return answer;
    }
}