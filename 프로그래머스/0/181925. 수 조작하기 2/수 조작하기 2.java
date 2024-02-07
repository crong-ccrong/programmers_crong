class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int[] num = new int[numLog.length-1];
        for (int i=0; i<num.length; i++) {
            num[i] = numLog[i+1] - numLog[i];
        }
        for (int i : num) {
            switch (i) {
                case (1) :
                    answer += "w";
                    break;
                case (-1) :
                    answer += "s";
                    break;
                case (10) :
                    answer += "d";
                    break;
                case (-10) :
                    answer += "a";
                    break;
            }
        }
        return answer;
    }
}