import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : topping) {
            map.put(i, map.getOrDefault(i, 0)+1);
            set2.add(i);
        }
        
        for (int i=0; i<topping.length; i++) {
            set1.add(topping[i]);
            map.put(topping[i], map.get(topping[i])-1);
            if (map.get(topping[i]) == 0) {
                set2.remove(topping[i]);
            }
            if (set1.size() == set2.size()) {
                answer++;
            }
        }        
        return answer;
    }
}