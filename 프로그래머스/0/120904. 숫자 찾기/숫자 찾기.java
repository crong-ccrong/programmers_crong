class Solution {
    public int solution(int num, int k) {
        return (num+"").contains(k+"") ? (num+"").indexOf(k+"")+1 : -1;
    }
}