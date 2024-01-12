class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i=0; i<num_list.length; i++) {
            answer[i] = (n<num_list.length) ? num_list[n] : num_list[n-num_list.length];
            n++;
        }
        return answer;
    }
}