import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        List<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		List<String> union = new LinkedList<>();
		List<String> intersection = new LinkedList<>();
        
        // 소문자로 바꾸기
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
        
        // 두 단어씩 끊어서 list에 담기 + 영문자가 아닌 글자쌍은 삭제
		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.charAt(i)>='a' && str1.charAt(i)<='z' && str1.charAt(i+1)>='a' && str1.charAt(i+1)<='z') {
				list1.add(str1.substring(i, i + 2));
			}
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.charAt(i)>='a' && str2.charAt(i)<='z' && str2.charAt(i+1)>='a' && str2.charAt(i+1)<='z') {
				list2.add(str2.substring(i, i + 2));
			}
		}
        
        // 교집합, 합집합 구하기
		for (String str : list1) {
			if (list2.contains(str)) {
				list2.remove(str);
				intersection.add(str);
			}
			union.add(str);
		}
		
		for (String str : list2) {
			union.add(str);
		}
        
        // 자카드 유사도
        int answer = (union.size() == 0) ? 1*65536 : (int) Math.floor((double)intersection.size()/union.size()*65536);
        
        return answer;
    }
}