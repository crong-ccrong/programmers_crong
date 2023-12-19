import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // 추월하기 전 순서를 배열 리스트에 담기
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        // 호명되면 앞 사람과 순서 바꾸기
        for (int i=0; i<callings.length; i++) {
            int idx = map.get(callings[i]);
            String temp = players[idx];
            
            players[idx] = players[idx-1];
            players[idx-1] = temp;
            
            map.put(temp, idx-1);
            map.put(players[idx], idx);
        }
        return players;
    }
}