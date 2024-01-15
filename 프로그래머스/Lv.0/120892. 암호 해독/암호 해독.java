class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray();
        for (int i=0; i<arr.length/code; i++) {
            answer += arr[(code-1)+code*i];
        }
        return answer;
    }
}