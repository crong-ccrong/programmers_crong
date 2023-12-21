class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        
        for (int i : section) {
            if (i > idx) {
                answer++;
                idx = i + m - 1;
            }
        }
        return answer;
    }
}