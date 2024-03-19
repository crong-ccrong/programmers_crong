class Solution {
    public int solution(String my_string) {
        String temp = "";
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                temp += c;
            } else {
                if (!temp.isEmpty()) {
                    answer += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.isEmpty()) {
            answer += Integer.parseInt(temp);
        }
        return answer;
    }
}