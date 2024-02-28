class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            char[] arr = (i+"").toCharArray();
            for (char c : arr) {
                answer = (c == '7') ? answer+1 : answer;
            }
        }
        return answer;
    }
}