class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int max = 0;
        
        for (int i : lottos) {
            for (int j : win_nums) {
                if (i==j) {
                    min++;
                }
            }
            if (i==0) {
                max++;
            }
        }
        max += min;
        
        min = (min==6) ? 1 : (min==5) ? 2 : (min==4) ? 3 : (min==3) ? 4 : (min==2) ? 5 : 6;
		max = (max==6) ? 1 : (max==5) ? 2 : (max==4) ? 3 : (max==3) ? 4 : (max==2) ? 5 : 6;
        
        int[] answer = {max, min};
        return answer;
    }
}