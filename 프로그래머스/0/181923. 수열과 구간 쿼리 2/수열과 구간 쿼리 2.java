import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        for (int[] arry : queries) {
            int temp = Integer.MAX_VALUE;
            for (int i=arry[0]; i<=arry[1]; i++) {
                temp = (arr[i] > arry[2]) ? Math.min(temp, arr[i]) : temp;
            }
            answer[index++] = (temp == Integer.MAX_VALUE) ? -1 : temp;
        }
        return answer;
    }
}