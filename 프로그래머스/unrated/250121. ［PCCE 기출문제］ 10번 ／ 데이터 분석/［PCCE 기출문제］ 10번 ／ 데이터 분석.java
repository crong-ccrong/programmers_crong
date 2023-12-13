import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int idx = (ext.equals("code")) ? 0 : (ext.equals("date")) ? 1 : (ext.equals("maximum")) ? 2 : 3;
		int sort = (sort_by.equals("code")) ? 0 : (sort_by.equals("date")) ? 1 : (sort_by.equals("maximum")) ? 2 : 3;
		
		List<int[]> list = new ArrayList<>();
		
		for (int i=0; i<data.length; i++) {
			if (data[i][idx] < val_ext) {
				list.add(data[i]);
			}
		}
		
		// 커스텀 Comparator를 이용한 정렬
        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sort], b[sort]);
            }
        });
        
        // int[][]을 반환하기 위한 배열 answer
        int[][] answer = new int[list.size()][];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}