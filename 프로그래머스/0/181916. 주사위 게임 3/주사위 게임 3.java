import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        map.put(a, 1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);
        
        switch(map.size()) {
            case 1 :
                answer = 1111*a;
                break;
            case 2 :
                if (map.get(a) == 2) {
                    answer = (a != b) ? (int) Math.abs(Math.pow(a, 2) - Math.pow(b, 2)) : (a != c) ? (int) Math.abs(Math.pow(a, 2) - Math.pow(c, 2)) : (a != d) ? (int) Math.abs(Math.pow(a, 2) - Math.pow(d, 2)) : (b != c) ? (int) Math.abs(Math.pow(b, 2) - Math.pow(c, 2)) : (b != d) ? (int) Math.abs(Math.pow(b, 2) - Math.pow(d, 2)) : (int) Math.abs(Math.pow(c, 2) - Math.pow(d, 2));
                } else {
                    int temp = 0;
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        temp = (entry.getValue() == 3) ? entry.getKey() : temp;
                        answer = (entry.getValue() == 1) ? entry.getKey() : answer;
                    }
                    answer = (int) Math.pow(10*temp+answer, 2);
                }
                break;
            case 3 :
                answer = 1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    answer = (entry.getValue() == 1) ? answer * entry.getKey() : answer;
                }
                break;
            case 4 :
                answer = Math.min(Math.min(a, b), Math.min(c, d));
                break;
        }
        return answer;
    }
}