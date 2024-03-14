import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (flag[i]) {
                int count = 0;
                while (count < arr[i]*2) {
                    answer.add(arr[i]);
                    count++;
                }
            } else {
                int count = 0;
                while (count < arr[i]) {
                    answer.remove(answer.size()-1);
                    count++;
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}