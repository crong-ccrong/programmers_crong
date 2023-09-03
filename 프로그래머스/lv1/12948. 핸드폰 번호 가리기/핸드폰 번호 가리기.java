class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int phoneNumberLength = phone_number.length();
        
        for (int i=0; i<phoneNumberLength-4; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(phone_number.length()-4);

        return answer;
    }
}