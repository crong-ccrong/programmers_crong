class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String operator = "+";
        for (String s : my_string.split(" ")) {
            if (!s.equals("+") && !s.equals("-")) {
                answer = (operator == "+") ? answer+Integer.parseInt(s) : answer-Integer.parseInt(s);
            } else {
                operator = (s.equals("+")) ? "+" : "-";
            }
        }
        return answer;
    }
}