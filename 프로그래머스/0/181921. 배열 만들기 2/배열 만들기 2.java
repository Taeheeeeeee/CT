import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] result = IntStream.rangeClosed(l, r)
				.filter(n -> String.valueOf(n).chars().allMatch(c -> c == '0' || c == '5'))
				.toArray();
		return result.length > 0 ? result : new int[]{-1};
    }
}