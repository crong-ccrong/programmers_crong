class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int max = 1;
        int temp = b;
        
        while (a!=0) {
            max = a;
            a = b%a;
            b = max;
        }
        
        temp = temp/max;
        
        while (temp%2==0) {
            temp = temp/2;
        }

        while (temp%5==0) {
            temp = temp/5;
        }

        if (temp==1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }    
}