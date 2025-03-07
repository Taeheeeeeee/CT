import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
		for(int[] query : queries) {
			int i = query[0];
			int j = query[1];

			int tmp = answer[i];
			answer[i] = answer[j];
			answer[j] = tmp;
		}
        return answer;
    }
}