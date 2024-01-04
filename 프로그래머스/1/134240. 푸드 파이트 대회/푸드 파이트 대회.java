class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        
        for (int i : food) {
            str += i;
        }
        
        for (int i=1; i<food.length; i++) {
            answer = answer + (i+"").repeat(food[i]/2);
        }
        
        answer = answer + 0 + new StringBuilder(answer).reverse().toString();
        
        return answer;
    }
}