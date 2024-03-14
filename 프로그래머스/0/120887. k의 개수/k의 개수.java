class Solution {
    public int solution(int i, int j, int k) {
        String s = "";
        for (int num=i; num<=j; num++) {
            s += num;
        }
        int length = s.length();
        return length - s.replace(k+"", "").length();
    }
}