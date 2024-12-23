import java.util.stream.Stream;
class Solution {
    public int[] solution(int n) {
        return Stream.iterate(n, x -> x >= 1, x -> x == 1 ? 0: x % 2 == 0 ? x / 2 : 3 * x + 1)
				.mapToInt(Integer::intValue)
				.toArray();
    }
}