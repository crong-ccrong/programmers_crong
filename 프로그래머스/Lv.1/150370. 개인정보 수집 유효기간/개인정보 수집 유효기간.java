import java.time.LocalDate;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int index = 1;
		List<Integer> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		LocalDate todayLocalDate = LocalDate.parse(today.replace('.', '-'));
		
		for (String s : terms) {
			map.put(s.split(" ")[0], Integer.parseInt(s.split(" ")[1]));
		}
        
		for (String arr : privacies) {
			LocalDate date = LocalDate.parse(arr.split(" ")[0].replace('.', '-')).plusMonths(map.get(arr.split(" ")[1]));
			if (date.isBefore(todayLocalDate) || date.isEqual(todayLocalDate)) {
				list.add(index);
			}
			index++;
		}
        
		int[] answer = list.stream()
				.mapToInt(i -> i)
				.toArray();
        
        return answer;
    }
}