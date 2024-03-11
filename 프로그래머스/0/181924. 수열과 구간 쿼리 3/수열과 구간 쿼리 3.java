class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] arry : queries) {
            int temp = arr[arry[0]];
            arr[arry[0]] = arr[arry[1]];
            arr[arry[1]] = temp;
        }
        return arr;
    }
}