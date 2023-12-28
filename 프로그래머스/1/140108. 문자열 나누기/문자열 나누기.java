class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int index = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(index) == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answer++;
                index = i+1;
            }
        }
        return (count == 0) ? answer : ++answer;
    }
}