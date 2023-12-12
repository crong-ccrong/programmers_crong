class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length; // board의 길이
		int count = 0; // 같은 색으로 색칠된 칸의 갯수
		int[] dh = {0,1,-1,0}; // h의 변화량
		int[] dw = {1,0,0,-1}; // w의 변화량
		
		for (int i=0; i<=3; i++) {
			int h_check = h+dh[i];
			int w_check = w+dw[i];
			
			if (h_check>=0 && h_check<n && w_check>=0 && w_check<n) {
				count = (board[h][w].equals(board[h_check][w_check])) ? ++count : count;
			}
			
		}
        
        return count;
    }
}