class Solution {
    public int[] solution(int[] arr) {
 
        // 배열 길이가 1인 경우 -1 반환
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        // 임의로 가장 작은 값 잡음
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }
        return answer;
    }
}