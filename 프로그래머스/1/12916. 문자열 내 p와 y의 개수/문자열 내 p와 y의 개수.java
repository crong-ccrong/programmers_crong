class Solution {
    boolean solution(String s) {
        
        int answer = 0;

        for (char a : s.toLowerCase().toCharArray()) {
            answer = (a == 'p') ? ++answer : (a == 'y') ? --answer : answer;
        }

        return (answer == 0) ? true : false;
    }
}