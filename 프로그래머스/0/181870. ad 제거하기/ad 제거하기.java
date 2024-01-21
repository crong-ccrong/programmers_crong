class Solution {
    public String[] solution(String[] strArr) {
        String s = "";
        for (String str : strArr) {
            s += (str.contains("ad")) ? "" : str + " ";
        }
        String[] answer = s.split(" ");
        return answer;
    }
}