class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("left")) {
            System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
            answer[answer.length-1] = numbers[0];
        } else {
            System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
            answer[0] = numbers[numbers.length-1];
        }
        return answer;
    }
}