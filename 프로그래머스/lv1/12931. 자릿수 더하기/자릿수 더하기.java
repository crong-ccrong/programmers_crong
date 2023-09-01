import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int radix = 1;
        
        while (true) {
            if (radix>=n) {
                break;
            }
            radix = radix * 10;
        }
        
        for (int i = 1; i <= radix; i = i * 10) {
            answer = answer + (n/i)%10;
            }
        
        return answer;
    }
}