class Solution {
    public int[] solution(int[] num_list) {
        int oddNum = 0;
        
        for(int i=0; i<num_list.length; i++){
           if (num_list[i] % 2 == 1) {
               oddNum++;
           }
        }
        
        int[] answer = {num_list.length-oddNum, oddNum};
        return answer;
    }
}