import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(!st.empty() && st.peek()==arr[i]) { 
                st.pop();
            } st.push(arr[i]);
        }
    int[] answer = new int[st.size()];
        for(int j=0; j<answer.length; j++) {
            answer[j] = st.get(j);
        }
        return answer;
    }
}