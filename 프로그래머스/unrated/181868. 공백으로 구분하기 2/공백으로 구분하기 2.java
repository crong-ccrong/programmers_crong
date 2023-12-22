class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
		answer = my_string.trim().split("\\s+");
        return answer;
    }
}