class Solution {
    public int[] solution(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i] = (arr[i]>=50 && arr[i]%2==0) ? arr[i]/2 : (arr[i]<50 && arr[i]%2==1) ? arr[i]*2 : arr[i];
        }
        return arr;
    }
}