import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        
        ArrayList<String> visited = new ArrayList<>();
        
        // 좌표 이동
		for (int i = 0; i < dirs.length(); i++) {
			int postx = x;
			int posty = y;
			
			char c = dirs.charAt(i);
			
			if (c == 'U' && y<5) {
				y++;
			} else if (c == 'D' && y>-5) {
				y--;
			} else if (c == 'R' && x<5) {
				x++;
			} else if (c == 'L' && x>-5) {
				x--;
			}
			
			// 한 번 방문한 길은 양방향으로 visited 리스트에 담기
			String xy = Integer.toString(x)+Integer.toString(y)+"";
			String postxy = Integer.toString(postx)+Integer.toString(posty)+"";
			String xyPostxy = xy+postxy;
			String postxyXy = postxy+xy;
			if (!visited.contains(postxy) && !visited.contains(xyPostxy) && !xyPostxy.equals(postxyXy)) {
				visited.add(xyPostxy);
				visited.add(postxyXy);
			}
		}
        
        return visited.size()/2;
    }
}