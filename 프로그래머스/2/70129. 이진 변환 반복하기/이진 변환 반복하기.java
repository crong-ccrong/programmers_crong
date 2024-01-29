class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        while (!s.equals("1")) {
            int temp = s.length();
            s = s.replace("0", "");
            zero += temp - s.length();
            s = Integer.toBinaryString(s.length());
            count++;
        }
        int[] answer = {count, zero};
        return answer;
    }
}