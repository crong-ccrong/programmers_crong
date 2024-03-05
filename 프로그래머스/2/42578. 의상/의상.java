import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        int answer = 1;
        for(String[] arr : clothes) {
            List<String> list = map.getOrDefault(arr[1], new ArrayList<>());
            list.add(arr[0]);
            map.put(arr[1], list);
        }
        for (String s : map.keySet()) {
            answer *= map.get(s).size()+1;
        }
        return answer-1;
    }
}