class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (hp != 0) {
            while (hp/5 != 0) {
                answer += (int)hp/5;
                hp %= 5;
            }
            while (hp/3 != 0) {
                answer += (int)hp/3;
                hp %= 3;
            }
            while (hp/1 != 0) {
                answer += (int)hp/1;
                hp %= 1;
            }
        }
        
        return answer;
    }
}