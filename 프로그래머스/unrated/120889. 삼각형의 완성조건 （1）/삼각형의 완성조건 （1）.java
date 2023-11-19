class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for (int i = 0; i<2; i++) {
			int temp;
			if (sides[i] > sides[i+1]) {
				temp = sides[i];
				sides[i] = sides[i+1];
				sides[i+1] = temp;
			}
		}
		
		if (sides[2]<sides[0]+sides[1]) {
			answer = 1;
		} else {
			answer = 2;
		}
        
        return answer;
    }
}