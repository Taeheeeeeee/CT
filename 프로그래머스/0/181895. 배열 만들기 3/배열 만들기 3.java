import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
				.flatMapToInt(interval -> IntStream
                              .rangeClosed(interval[0], interval[1])
                              .map(i -> arr[i])) 
				.toArray();
    }
}