class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        
        for (String a : str) {
            if (a.isBlank()) {
                answer += " ";
            } else {
                answer = answer + (a.charAt(0)+"").toUpperCase() + a.toLowerCase().substring(1) + " ";
            }
        }
        answer = (s.length() == answer.length()) ? answer : answer.substring(0, answer.length()-1);
        return answer;
    }
}