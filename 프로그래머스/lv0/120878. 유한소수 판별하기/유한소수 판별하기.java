import java.util.*;

class Solution {
    public int eucd (int a, int b) {
            if (b==0) {
                return a;
            }
            return eucd (b, a%b);
    }
    
    public int solution(int a, int b) {
        int answer = 2;

        // 분수를 기약분수로 만들기 > 분자와 분모의 최대공약수로 약분하기
        int d= b/eucd(a, b);

        // 기약분수의 분모의 소인수 구하여 return값 결정
        while (d%2==0) {
            d /=2;
        }
        while (d%5==0) {
            d /=5;
        }
        if (d==1) {
            answer =1;
        } else {
            answer =2;
        }

        return answer;
    }
}