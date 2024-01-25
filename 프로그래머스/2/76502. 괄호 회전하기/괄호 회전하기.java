import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = -1;
		
		// Deque에 괄호 넣기
		Deque<Character> dq = new LinkedList<>();
		for (char c : s.toCharArray()) {
			dq.offerLast(c);
		}
		
		// 괄호 회전시키면서 올바른 괄호가 몇 개 있나 찾기
		for (int i=0; i<s.length(); i++) {
			
			Stack<Character> st = new Stack<>();
			
			// 첫 문자가 닫힌 괄호면 회전 돌리기
			if (dq.getFirst() == ')' || dq.getFirst() == '}' || dq.getFirst() == ']') {
				char temp = dq.pollFirst();
				dq.offerLast(temp);
				continue;
			}
			
			// 문자열이 올바른 괄호인지 확인
			for (char c : dq) {
				if (c == ')' || c == '}' || c == ']') {
                    if (!st.empty()) {
					    switch (c) {
					    case ')' :
						    if (st.peek()=='(') {
							    st.pop();
						    }
						    break;
					    case '}' :
						    if (st.peek()=='{') {
							    st.pop();
						    }
						    break;
					    case ']' :
						    if (st.peek()=='[') {
							    st.pop();
						    }
						    break;
					    }
                    }
				} else {
					st.push(c);
				}
			}
			
			if (st.empty()) {
				answer++;
			}
			
			char temp = dq.pollFirst();
			dq.offerLast(temp);
		}
		return answer+1;
	}
}