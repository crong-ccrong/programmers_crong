class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
			while (s.startsWith("aya") || s.startsWith("ye") || s.startsWith("woo") || s.startsWith("ma")) {
				if (s.startsWith("aya")) {
					s = s.substring(3, s.length());
				} else if (s.startsWith("ye")) {
					s = s.substring(2, s.length());
				} else if (s.startsWith("woo")) {
					s = s.substring(3, s.length());
				} else { //if (s.startsWith("ma"))
					s = s.substring(2, s.length());
				}
			}
			if (s.length() == 0) {
				answer++;
			}
		}
        
        return answer;
    }
}