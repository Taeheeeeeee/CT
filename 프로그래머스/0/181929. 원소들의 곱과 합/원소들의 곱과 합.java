import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int product = Arrays.stream(num_list)
                .reduce((a, b) -> a * b).getAsInt();
        int sum = Arrays.stream(num_list).sum();
        return product < Math.pow(sum, 2) ? 1 : 0;
    }
}