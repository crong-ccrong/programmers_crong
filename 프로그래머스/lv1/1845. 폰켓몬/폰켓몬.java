import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        
        int answer = (nums.length/2 > set.size()) ? set.size() : nums.length/2;
       
        return answer;
    }
}