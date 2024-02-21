import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<String> answer = new ArrayList<>();
        Map<String, List<String>> headMap = new HashMap<>();
        Map<Integer, List<String>> numberMap = new HashMap();
        
        // head로 정렬
        for (String str : files) {
			String head = str.split("(?<=\\D)(?=\\d)")[0].toLowerCase();
			List<String> list = headMap.getOrDefault(head, new ArrayList<>());
			list.add(str);
			headMap.put(head, list);
		}
		List<String> headKeyList = new ArrayList<>(headMap.keySet());
		Collections.sort(headKeyList);
        
        // number로 정렬
        for (String str : headKeyList) {
			for (String s : headMap.get(str)) {
				int number = Integer.parseInt(s.replace(" ", "").replace(".", "").replace("-", "").split("\\D+")[1]);
				List<String> list = numberMap.getOrDefault(number, new ArrayList<>());
				list.add(s);
				numberMap.put(number, list);
			}
			List<Integer> numberKeyList = new ArrayList<>(numberMap.keySet());
			Collections.sort(numberKeyList);
            
            // 정렬된 파일명을 순서대로 담기
			for (int i : numberKeyList) {
				for (String element : numberMap.get(i)) {
					answer.add(element);
				}
			}
			numberMap.clear();
		}
        
        return answer.toArray(new String[answer.size()]);
    }
}