class Solution {
    public boolean solution(int x) {
        boolean answer = (true);
        int sum = 0;
        String str = x+"";
        for (char c : str.toCharArray()) {
            sum += c-'0';
        }
        answer = (x%sum==0) ? true : false;
        return answer;
    }
}