import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Deque<Integer> dq = new LinkedList<Integer>();
        
        for (int i=0; i<arr.length; i++) {
        	if (!dq.isEmpty() && dq.getLast() == arr[i]) {
                continue;
    	    }
            dq.add(arr[i]);
        }
        
        int[] answer = new int[dq.size()];
        for (int i=0; i<answer.length; i++) {
			answer[i] = dq.getFirst();
			dq.removeFirst();
		}
        return answer;
    }
}