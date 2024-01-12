class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char c : my_string.toCharArray()) {
            answer += (c>='A' && c<='Z') ? (char)(c+32) : (char)(c-32);
        }
        return answer;
    }
}