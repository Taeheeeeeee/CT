import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int start = IntStream.range(0, arr.length)
				.filter(i -> arr[i] == 2)
				.findFirst()
				.orElse(-1);

		if (start == -1) return new int[]{-1};

		int end = IntStream.range(start + 1, arr.length)
				.filter(i -> arr[i] == 2)
				.reduce((first, second) -> second)
				.orElse(-1);

        return Arrays.copyOfRange(arr, start, (end <= start ? start + 1 : end + 1));
    }
}