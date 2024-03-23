import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        for (int i=0; i<my_str.length(); i+=n) {
            if (i+n < my_str.length()) {
                answer.add(my_str.substring(i, i+n));
            } else {
                answer.add(my_str.substring(i, my_str.length()));
            }
        }
        return answer.stream().toArray(String[] :: new);
    }
}