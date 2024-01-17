class Solution {
    public String[] solution(String[] names) {
        int length = (names.length%5==0) ? names.length/5 : names.length/5+1;
        String[] answer = new String[length];
        for (int i=0; i<answer.length; i++) {
            int index = i*5;
            if (index < names.length) {
                answer[i] = names[index];
            }
        }
        return answer;
    }
}