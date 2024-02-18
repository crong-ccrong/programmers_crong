import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> gift = new HashMap<>();
        Map<String, Integer> giftValue = new HashMap<>();
        
        // 주고 받은 목록
        for (int i = 0; i < friends.length; i++) {
            giftValue.put(friends[i], 0);
			for (int j = i + 1; j < friends.length; j++) {
				map.put(friends[i] + " " + friends[j], 0);
			}
		}
        
        // 주고 받은 선물 계산
        for (int i = 0; i < gifts.length; i++) {
			if (map.containsKey(gifts[i].split(" ")[1] + " " + gifts[i].split(" ")[0])) {
				map.put(gifts[i].split(" ")[1] + " " + gifts[i].split(" ")[0],
						map.get(gifts[i].split(" ")[1] + " " + gifts[i].split(" ")[0]) - 1);
			} else {
				map.put(gifts[i], map.getOrDefault(gifts[i], 0) + 1);
			}
		}
        
        // 선물치
		for (String s : gifts) {
			// 준 선물 더하기
			giftValue.put(s.split(" ")[0], giftValue.get(s.split(" ")[0]) + 1);
            // 받은 선물 빼기
			giftValue.put(s.split(" ")[1], giftValue.get(s.split(" ")[1]) - 1);
		}
        
        // 받을 선물 예측
        for (String s : map.keySet()) {
			if (map.get(s) > 0) {
				gift.put(s.split(" ")[0], gift.getOrDefault(s.split(" ")[0], 0) + 1);
			} else if (map.get(s) < 0) {
				gift.put(s.split(" ")[1], gift.getOrDefault(s.split(" ")[1], 0) + 1);
			} else { // 선물치 고려
				if (giftValue.get(s.split(" ")[0]) > giftValue.get(s.split(" ")[1])) {
					gift.put(s.split(" ")[0], gift.getOrDefault(s.split(" ")[0], 0) + 1);
				} else if (giftValue.get(s.split(" ")[0]) < giftValue.get(s.split(" ")[1])) {
					gift.put(s.split(" ")[1], gift.getOrDefault(s.split(" ")[1], 0) + 1);
				}
			}
		}
        return gift.size() != 0 ? Collections.max(gift.values()) : 0;
    }
}