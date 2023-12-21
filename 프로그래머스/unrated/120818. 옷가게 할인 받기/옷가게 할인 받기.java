class Solution {
    public int solution(int price) {
		int answer = (int) ((price >= 500000) ? price * 0.8 : (price >= 300000) ? price * 0.9 : (price >= 100000) ? Math.floor(price * 0.95) : price);
        return answer;
    }
}