import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int evenSum = IntStream.rangeClosed(1, num_list.length)
				.filter(i -> i % 2 == 0)
				.map(i -> num_list[i-1])
				.sum();

		int oddSum = IntStream.rangeClosed(1, num_list.length)
				.filter(i -> i % 2 != 0)
				.map(i -> num_list[i-1])
				.sum();
        return Math.max(oddSum, evenSum);
    }
}