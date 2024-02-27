class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] arry : queries) {
            for (int i=arry[0]; i<=arry[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}