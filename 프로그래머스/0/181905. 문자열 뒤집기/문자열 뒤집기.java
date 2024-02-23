class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        
        for (int i=e; i>=s; i--) {
            answer += my_string.charAt(i);
        }
        
        for (int i=e+1; i<my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}