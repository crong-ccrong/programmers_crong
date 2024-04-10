import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for (int[] arr : dots) {
            if (arr[0] != dots[0][0] && arr[1] != dots[0][1]) {
                x = arr[0];
                y = arr[1];
                break;
            }
        }
        return Math.abs(dots[0][0] - x) * Math.abs(dots[0][1] - y);
    }
}