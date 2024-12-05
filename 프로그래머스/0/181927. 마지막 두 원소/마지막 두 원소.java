import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list[num_list.length -1];
        int b = num_list[num_list.length -2];
        return IntStream.concat(Arrays.stream(num_list),
                                IntStream.of(a > b ? a - b : a * 2))
                .toArray();
    }
}