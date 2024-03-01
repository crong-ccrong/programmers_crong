import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}