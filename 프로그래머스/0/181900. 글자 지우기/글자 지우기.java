import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
		
		IntStream.of(indices)
				.boxed()
				.sorted((a, b) -> b - a) 
                // 내림차순 정렬 (앞에서부터 제거하면 인덱스가 틀어짐)
				.forEach(index -> sb.deleteCharAt(index));

        return sb.toString();
    }
}