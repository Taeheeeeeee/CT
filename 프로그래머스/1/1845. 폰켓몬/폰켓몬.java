import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int count = (int) Arrays.stream(nums)
                .distinct()
                .count();
        int s = nums.length / 2;

        return s > count ? count : s;
    }
}