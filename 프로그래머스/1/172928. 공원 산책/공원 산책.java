class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        // 공원을 이차 정수 배열에 담음
		char[][] place = new char[park.length][park[0].length()];
		int start_i = 0;
		int start_j = 0;
		
		for (int i=0; i<park.length; i++) {
			for (int j=0; j<park[0].length(); j++) {
				place[i][j] = park[i].charAt(j);
				if (place[i][j] == 'S') {
					start_i = i;
					start_j = j;
				}
			}
		}
        
        // 산책
		for (String s : routes) {
			String[] arr = s.split(" ");
			int temp_i = start_i;
			int temp_j = start_j;
			for (int i=0; i<Integer.parseInt(arr[1]); i++) {
				start_i = (arr[0].equals("N")) ? --start_i : (arr[0].equals("S")) ? ++start_i : start_i;
				start_j = (arr[0].equals("W")) ? --start_j : (arr[0].equals("E")) ? ++start_j : start_j;
				if (start_i<0 || start_i>=park.length || start_j<0 || start_j>=park[0].length() || place[start_i][start_j] == 'X') {
					start_i = temp_i;
					start_j = temp_j;
					break;
				}
			}
		}
        
        int[] answer = {start_i, start_j};
        return answer;
    }
}