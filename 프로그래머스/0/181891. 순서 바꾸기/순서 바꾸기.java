import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] back = Arrays.copyOfRange(num_list, n, num_list.length);
		int[] front = Arrays.copyOf(num_list, n);
        
        return IntStream.concat(Arrays.stream(back), Arrays.stream(front))
				.toArray();
    }
}