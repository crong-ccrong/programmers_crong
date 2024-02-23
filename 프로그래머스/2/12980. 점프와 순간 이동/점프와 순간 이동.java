import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 1;
        while (n != 1) {
            answer = (n%2 == 1) ? answer+1 : answer;
            n /= 2;
        }
        return answer;
    }
}