import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (String s : picture) {
            String str = "";
            for (char c : s.toCharArray()) {
                str += (c+"").repeat(k);
            }
            for (int i=0; i<k; i++) {
                answer.add(str);
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}