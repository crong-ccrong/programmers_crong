class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        
        while (end<=n) {
            if (sum<n) {
                sum += ++end;
            } else if (sum==n) {
                sum += ++end;
                answer++;
            } else {
                sum -= start++;
            }
        }
        return answer;
    }
}