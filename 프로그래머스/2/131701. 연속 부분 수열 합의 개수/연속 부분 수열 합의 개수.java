import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int[] arr = new int[elements.length*2 -1];
        System.arraycopy(elements, 0, arr, 0, elements.length);
        System.arraycopy(elements, 0, arr, elements.length, elements.length-1);
        Set<Integer> set = new HashSet<>();
        
        for (int i=1; i<=elements.length; i++) { // 길이
            for (int j=0; j<elements.length; j++) { // 시작 인덱스
                int sum = 0;
                for (int k=j; k<i+j; k++) {
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}