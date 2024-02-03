import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = Arrays.stream(intervals)
            .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]+1))
            .map(index -> arr[index])
            .toArray();
        return answer;
    }
}