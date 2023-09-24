class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 원하는 글자수만큼 지정
            answer[i] = String.format("%"+n+"s",answer[i]);
            
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
        }
        return answer;
    }
}