import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            for (int j : delete_list) {
                if (i == j) {
                    list.remove(new Integer(i));
                    break;
                }
            }
        }
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}