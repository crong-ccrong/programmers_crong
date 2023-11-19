class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");
        answer = my_string;
        return answer;
    }
}