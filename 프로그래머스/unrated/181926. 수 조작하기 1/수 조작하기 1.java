class Solution {
    public int solution(int n, String control) {
        for (int i=0; i<control.length(); i++) {
			n += (control.charAt(i)=='w')?+1:(control.charAt(i)=='s')?-1:(control.charAt(i)=='d')?+10:-10; 
		}
        return n;
    }
}