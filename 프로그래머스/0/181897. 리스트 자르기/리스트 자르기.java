import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        return IntStream.range(0, num_list.length)
				.filter(i -> {
					switch (n) {
						case 1:
							return i <= b;
						case 2:
							return i >= a;
						case 3:
							return i >= a && i <= b; 
						case 4:
							return i >= a && i <= b && (i - a) % c == 0;
						default:
							return false;
					}
				})
				.map(i -> num_list[i])
				.toArray();
    }
}