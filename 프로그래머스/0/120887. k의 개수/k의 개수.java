class Solution {
    public int solution(int i, int j, int k) {
        String s = "";
        for (int num=i; num<=j; num++) {
            s += num;
        }
        return s.length() - s.replace(k+"", "").length();
    }
}