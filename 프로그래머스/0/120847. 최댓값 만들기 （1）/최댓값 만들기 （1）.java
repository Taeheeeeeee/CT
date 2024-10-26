import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int index = numbers.length;
        return numbers[index-1] * numbers[index-2];
    }
}