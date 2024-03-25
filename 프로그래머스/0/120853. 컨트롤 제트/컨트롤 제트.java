class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i-1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}