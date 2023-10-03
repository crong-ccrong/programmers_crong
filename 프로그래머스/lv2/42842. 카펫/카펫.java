class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // yellow의 가로+세로 길이 구하기
        int length = (brown - 4) / 2;
        
        // 가로x세로 = yellow
        for (int i = 1; i < length; i++) {
            if ((length-i) * i == yellow) {
                answer[0] = length-i+2;
                answer[1] = i+2;
                break;
            }
        }
        
        return answer;
    }
}