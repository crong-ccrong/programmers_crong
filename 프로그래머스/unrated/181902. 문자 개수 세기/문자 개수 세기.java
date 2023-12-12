class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char a : my_string.toCharArray()) {
            if (a >= 'a') {
                answer[a-'a'+26]++;
            } else {
                answer[a-'A']++;
            }
        }
        
        return answer;
    }
}