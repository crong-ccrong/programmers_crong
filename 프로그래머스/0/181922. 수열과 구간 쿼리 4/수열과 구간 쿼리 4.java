class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] arry : queries) {
            for (int i=0; i<arr.length; i++) {
                arr[i] = (i>=arry[0] && i<=arry[1] && i%arry[2]==0) ? arr[i]+1 : arr[i];
            }
        }
        return arr;
    }
}