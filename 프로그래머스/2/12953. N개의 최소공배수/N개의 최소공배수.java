import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        // 소인수 분해
        for (int i : arr) {
            Map<Integer, Integer> count = new HashMap<>();
            
            for (int j=2; j<=i; j++) {
                while (i%j == 0) {
                    count.put(j, count.getOrDefault(j, 0)+1);
                    i /= j;
                }
            }
            
            for (Integer a : count.keySet()) {
                if (map.get(a) == null) {
                    map.put(a, count.get(a));
                } else {
                    map.put(a, (map.get(a) > count.get(a)) ? map.get(a) : count.get(a));
                }
            }
        }
        
        for (Integer b : map.keySet()) {
            answer = answer * (int) Math.pow(b, map.get(b));
        }
        return answer;
    }
}