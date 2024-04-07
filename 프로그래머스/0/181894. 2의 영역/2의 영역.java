class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        boolean found = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                found = true;
                break;
            }
        }
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        if (found) {
            if (start != end) {
                int[] answer = new int[end - start + 1];
                System.arraycopy(arr, start, answer, 0, end - start + 1);
                return answer;
            } else {
                return new int[]{2};
            }
        } else {
            return new int[]{-1};
        }
    }
}