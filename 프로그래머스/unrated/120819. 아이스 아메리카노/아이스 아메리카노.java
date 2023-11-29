class Solution {
    public int[] solution(int money) {
        int[] answer = {(int)money/5500, money-(5500*((int)money/5500))};
        return answer;
    }
}