class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        int count = 0;
        int index = 0;
        for (int i : arr) {
            length += i;
        }
        int[] answer = new int[length];
        for (int i=0; i<length; i++) {
            answer[i] = arr[index];
            count++;
            if (count == arr[index]) {
                index++;
                count = 0;
            }
        }
        return answer;
    }
}