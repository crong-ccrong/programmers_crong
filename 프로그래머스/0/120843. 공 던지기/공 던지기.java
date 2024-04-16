class Solution {
    public int solution(int[] numbers, int k) {
        return ((k*2-1)%numbers.length == 0) ? numbers.length : (k*2-1)%numbers.length;
    }
}