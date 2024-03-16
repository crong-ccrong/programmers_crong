class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num1 = numer1*denom2+numer2*denom1;
        int num2 = denom1*denom2;
        for (int i=2; i<=Math.sqrt(denom1*denom2); i++) {
            while (num1%i == 0 && num2%i == 0) {
                num1 /= i;
                num2 /= i;
            }
        }
        int[] answer = {num1, num2};
        return answer;
    }
}