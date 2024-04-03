import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        answer = Arrays.stream(answer).filter(s -> !s.isEmpty()).toArray(String[]::new);
        answer = answer.length == 0 ? new String[]{"EMPTY"} : answer;
        return answer;
    }
}