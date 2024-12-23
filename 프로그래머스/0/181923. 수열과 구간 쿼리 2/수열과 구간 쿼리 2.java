import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.range(0, queries.length)
				.map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1]) // s~e
						.map(i -> arr[i])
						.filter(i -> i > queries[q][2]) // k
						.min().orElse(-1)
				)
				.toArray();
    }
}