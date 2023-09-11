class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int max = 1;
        
        for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				max = i;
			}
		}
        
        b = b/max;
        
        while (b%2==0) {
            b = b/2;
        }
        
        while (b%5==0) {
            b = b/5;
        }
        
        if (b==1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}