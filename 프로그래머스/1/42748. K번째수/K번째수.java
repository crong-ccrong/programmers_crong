import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] arr : commands) {
            int[] arry = new int[arr[1]-arr[0]+1];
            System.arraycopy(array, arr[0]-1, arry, 0, arr[1]-arr[0]+1);
            Arrays.sort(arry);
            answer.add(arry[arr[2]-1]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}