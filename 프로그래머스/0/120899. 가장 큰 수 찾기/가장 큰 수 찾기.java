class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int max = 0;
        for (int i=0; i<array.length-1; i++) {
            max = Math.max(array[i], array[i+1]);
            index = (max == array[i]) ? i : i+1;
        }
        int[] answer = {max, index};
        return answer;
    }
}