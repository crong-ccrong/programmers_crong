import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(!st.empty && st.peek()==arr[i]) { 
                st.pop();
            } st.push(arr[i]);
        }

        return st;
    }
}