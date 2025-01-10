import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] str_list) {
        return IntStream.range(0, str_list.length)
				.filter(i -> "l".equals(str_list[i]) || "r".equals(str_list[i]))
				.findFirst()
				.stream()
				.mapToObj(i -> { 
					if ("l".equals(str_list[i])) {
						return Arrays.copyOfRange(str_list, 0, i);
					} else {
						return Arrays.copyOfRange(str_list, i + 1, str_list.length);
					}
				})
				.flatMap(Arrays::stream)
				.toArray(String[]::new);
    }
}