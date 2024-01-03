class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
        // 약수의 개수 구하기
        for (int i=1; i<=number; i++) {
            int count = 0;
            for (int j=1; j<=Math.sqrt(i); j++) {
                if (j == Math.sqrt(i)) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
                arr[i-1] = (count>limit) ? power : count;
            }
        }
        
        for (int i : arr) {
            answer += i;
        }
        
        return answer;
    }
}