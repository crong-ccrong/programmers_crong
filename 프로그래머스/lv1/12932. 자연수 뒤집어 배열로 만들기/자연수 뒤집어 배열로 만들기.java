class Solution {
    public int[] solution(long n) {
        int length = (int) Long.toString(n).length();
        int[] answer = new int[length];
        
        String str = Long.toString(n);
        for (int i=0; i<length; i++) {
			answer[i] = Character.getNumericValue(str.charAt(length-i-1));
        }
        return answer;
    }
}