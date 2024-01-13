class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (char c : rsp.toCharArray()) {
			answer += (c=='2') ? "0" : (c=='0') ? "5" : "2";
		}
        return answer;
    }
}