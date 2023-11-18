class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt("" + a + b);
        if(c<(2*a*b)) {
            answer = 2*a*b;
        } else {
            answer = c;
        }
        
        
        return answer;
    }
}