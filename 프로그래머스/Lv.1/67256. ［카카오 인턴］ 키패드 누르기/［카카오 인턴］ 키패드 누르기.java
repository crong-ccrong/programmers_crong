class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
		int[] L = {3, 0}; // *
		int[] R = {3, 2}; // #
		int lLength = 0;
		int rLength = 0;
		String temp = "";
		
		for (int i : numbers) {
			switch(i) {
			case 1 : 
				answer += "L";
				L[0] = 0;
				L[1] = 0;
				break;
			case 2 :
				lLength = Math.abs(L[0]-0) + Math.abs(L[1]-1);
				rLength = Math.abs(R[0]-0) + Math.abs(R[1]-1);
				temp = (lLength < rLength) ? "L" : (lLength > rLength) ? "R" : hand.substring(0,1).toUpperCase();
				answer += temp;
				if (temp.equals("L")) {
					L[0] = 0;
					L[1] = 1;
				} else {
					R[0] = 0;
					R[1] = 1;
				}
				break;
			case 3 :
				answer += "R";
				R[0] = 0;
				R[1] = 2;
				break;
			case 4 :
				answer += "L";
				L[0] = 1;
				L[1] = 0;
				break;
			case 5 :
				lLength = Math.abs(L[0]-1) + Math.abs(L[1]-1);
				rLength = Math.abs(R[0]-1) + Math.abs(R[1]-1);
				temp = (lLength < rLength) ? "L" : (lLength > rLength) ? "R" : hand.substring(0,1).toUpperCase();
				answer += temp;
				if (temp.equals("L")) {
					L[0] = 1;
					L[1] = 1;
				} else {
					R[0] = 1;
					R[1] = 1;
				}
				break;
			case 6 :
				answer += "R";
				R[0] = 1;
				R[1] = 2;
				break;
			case 7 :
				answer += "L";
				L[0] = 2;
				L[1] = 0;
				break;
			case 8 :
				lLength = Math.abs(L[0]-2) + Math.abs(L[1]-1);
				rLength = Math.abs(R[0]-2) + Math.abs(R[1]-1);
				temp = (lLength < rLength) ? "L" : (lLength > rLength) ? "R" : hand.substring(0,1).toUpperCase();
				answer += temp;
				if (temp.equals("L")) {
					L[0] = 2;
					L[1] = 1;
				} else {
					R[0] = 2;
					R[1] = 1;
				}
				break;
			case 9 :
				answer += "R";
				R[0] = 2;
				R[1] = 2;
				break;
			case 0 :
				lLength = Math.abs(L[0]-3) + Math.abs(L[1]-1);
				rLength = Math.abs(R[0]-3) + Math.abs(R[1]-1);
				temp = (lLength < rLength) ? "L" : (lLength > rLength) ? "R" : hand.substring(0,1).toUpperCase();
				answer += temp;
				if (temp.equals("L")) {
					L[0] = 3;
					L[1] = 1;
				} else {
					R[0] = 3;
					R[1] = 1;
				}
				break;
			}
		}
        return answer;
    }
}