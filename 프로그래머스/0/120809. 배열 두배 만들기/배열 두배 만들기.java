class Solution {
    public int[] solution(int[] numbers) {
        int idx = numbers.length;
        int[] answer = new int[idx];
        
        for(int i = 0; i < idx; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}