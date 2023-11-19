class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && b!=c && c!=a) {
            answer = a+b+c;
        } else if((a==b && b!=c) || (b==c && c!=a) || (c==a && a!=b)) {
            answer = (a+b+c)*(a*a+b*b+c*c);
            
        } else {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}