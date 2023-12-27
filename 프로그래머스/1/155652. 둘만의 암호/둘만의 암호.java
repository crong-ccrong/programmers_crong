import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (char a : s.toCharArray()) {
            int i = 0;
            
            while (i<index) {
                a = (a=='z') ? 'a' : (char)(a+1);
                if (!skip.contains(a+"")) {
                    i++;
                }
            }
            answer += a+"";
        }
        
        return answer;
    }
}