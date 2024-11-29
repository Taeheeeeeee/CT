import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        return Arrays.stream(num_list)
                .collect(() -> new int[2],
                        (result, i) -> result[i % 2]++,
                        (r1, r2) -> { });
    }
}