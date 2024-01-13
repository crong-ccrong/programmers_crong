class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        int index = 0;
        for (int i : numlist) {
            if (i%n==0) {
                count++;
            }
        }
        int[] answer = new int[count];
        for (int i : numlist) {
            if (i%n==0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}