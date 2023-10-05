import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> st = new Stack<>();

		st.push(s.charAt(0));

		for (int i=1; i<s.length(); i++) {
			if (!st.empty() && st.peek()==s.charAt(i)) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		
		answer = (st.empty()) ? 1 : 0;
        
        return answer;
    }
}