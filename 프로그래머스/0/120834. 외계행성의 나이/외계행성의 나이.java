class Solution {
    public String solution(int age) {
        String answer = "";
        // 유니코드 1 : 49, a : 97
        while (age > 0) {
            answer += (char)(age%10+97)+"";
            age /= 10;
        }
        return new StringBuffer(answer).reverse().toString();
    }
}