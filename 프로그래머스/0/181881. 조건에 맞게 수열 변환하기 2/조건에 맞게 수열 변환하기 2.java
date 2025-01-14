import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int[] array;

        while (true) {
            array = Arrays.copyOf(arr, arr.length);

            arr = Arrays.stream(arr)
                    .map(i -> i >= 50 && i % 2 == 0 ? i / 2 : i < 50 && i % 2 != 0 ? i * 2 + 1 : i)
                    .toArray();

            if (Arrays.equals(arr, array)) {
                break;
            }

            x++;
        }
        
        return x;
    }
}