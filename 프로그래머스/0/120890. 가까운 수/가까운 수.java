class Solution {
    public int solution(int[] array, int n) {
        int temp = Integer.MAX_VALUE;
        int answer = 0;
        for (int i : array) {
            if (temp == Math.abs(i-n)) {
                answer = Math.min(answer, i);
            } else if (temp > Math.abs(i-n)) {
                temp = Math.abs(i-n);
                answer = i;
            }
        }
        return answer;
    }
}