import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = null;
        switch(n) {
            case 1 :
                answer = new int[slicer[1] + 1];
                System.arraycopy(num_list, 0, answer, 0, answer.length);
                break;
            case 2 :
                answer = new int[num_list.length - slicer[0]];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            case 3 :
                answer = new int[slicer[1] - slicer[0] + 1];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            case 4 :
                List<Integer> list = new ArrayList<>();
                for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    list.add(num_list[i]);
                }
                answer = new int[list.size()];
                answer = list.stream().mapToInt(i -> i).toArray();
        }
        return answer;
    }
}