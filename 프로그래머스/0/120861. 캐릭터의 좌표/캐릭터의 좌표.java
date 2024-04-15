class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (String s : keyinput) {
            switch(s) {
                case "up" :
                    answer[1]++;
                    break;
                case "down" :
                    answer[1]--;
                    break;
                case "left" :
                    answer[0]--;
                    break;
                case "right" :
                    answer[0]++;
                    break;
            }
            answer[0] = (Math.abs(answer[0]) > board[0]/2) ? answer[0]/Math.abs(answer[0])*board[0]/2 : answer[0];
            answer[1] = (Math.abs(answer[1]) > board[1]/2) ? answer[1]/Math.abs(answer[1])*board[1]/2 : answer[1];
        }
        return answer;
    }
}