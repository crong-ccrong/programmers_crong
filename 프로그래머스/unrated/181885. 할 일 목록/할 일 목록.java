class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        
        for (int i=0; i<finished.length; i++) {
            answer += (finished[i]) ? "" : todo_list[i]+" ";
        }
        
        return answer.split(" ");
    }
}