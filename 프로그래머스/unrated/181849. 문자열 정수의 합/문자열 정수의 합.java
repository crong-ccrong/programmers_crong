class Solution {
    public int solution(String num_str) {
        int answer = 0;        
        for (char a : num_str.toCharArray()) {
            answer += (a-'0');
        }
        
        return answer;
    }
}