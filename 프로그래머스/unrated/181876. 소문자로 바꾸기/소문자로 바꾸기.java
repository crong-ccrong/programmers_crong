class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (c<'a' || c>'z') {
                c = (char)(c+32);
            }
            answer += c;
        }
        return answer;
    }
}