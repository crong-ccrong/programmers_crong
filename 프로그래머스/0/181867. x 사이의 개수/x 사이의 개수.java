class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        String temp = myString;
        int zero = 0;
        int length = 0;
        
        while (temp.endsWith("x")) {
            zero++;
            temp = temp.substring(0,temp.length()-1);
        }
        
        length = zero + str.length;
        System.out.println(length);
        int[] answer = new int[length];
        
        for (int i=0; i<length-zero; i++) {
            answer[i] = str[i].length();
        }
        return answer;
    }
}