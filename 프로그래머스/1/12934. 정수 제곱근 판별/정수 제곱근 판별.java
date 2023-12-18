class Solution {
    public long solution(long n) {
		long answer = (long) ((Math.sqrt(n)==Math.floor(Math.sqrt(n))) ? Math.pow(Math.sqrt(n)+1, 2) : -1);
        return answer;
    }
}