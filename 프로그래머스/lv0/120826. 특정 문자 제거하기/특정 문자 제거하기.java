import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        List<String> list = new LinkedList<>();
        
        for (int i=0; i<my_string.length(); i++) {
            if(!(my_string.charAt(i)+"").equals(letter)) {
                list.add(my_string.charAt(i)+"");
            }
        }
        for (String str : list) {
            answer += str;
        }
        return answer;
    }
}