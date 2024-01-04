class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for (int i=0; i<arr.length; i++) {
            answer[i] = (k%2==1) ? arr[i]*k : arr[i]+k;
        }
        return answer;
    }
}