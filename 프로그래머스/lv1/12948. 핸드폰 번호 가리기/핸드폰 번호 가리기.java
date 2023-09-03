class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int phoneNumberLength = phone_number.length();
        
        for (int i=0; i<phoneNumberLength-4; i++) {
            answer += "*";
        }
        
        answer = answer+phone_number.charAt(phoneNumberLength - 4)+phone_number.charAt(phoneNumberLength - 3)+phone_number.charAt(phoneNumberLength - 2)+phone_number.charAt(phoneNumberLength - 1);
        
        return answer;
    }
}