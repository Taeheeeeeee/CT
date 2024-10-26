class Solution {
    public int[] solution(int n) {
        int idx = n % 2 == 1 ? n / 2 + 1 : n / 2;
        int[] answer = new int[idx];
        
        int num = 1;
        for(int i = 0; i < idx; i++){
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
}