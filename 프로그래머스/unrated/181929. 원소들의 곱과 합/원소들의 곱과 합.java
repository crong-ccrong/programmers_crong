class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for (int i : num_list) {
            sum += i;
            mul *= i;
        }
        
        if (Math.pow(sum, 2) > mul) {
            answer = 1;
        }
        
        return answer;
    }
}