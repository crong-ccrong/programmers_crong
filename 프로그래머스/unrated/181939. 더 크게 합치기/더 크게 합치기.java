class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt("" + a + b);
        int d = Integer.parseInt("" + b + a);
        
        if (c<d) {
            answer = d;
        } else {
            answer = c;
        }
        
        return answer;
    }
}