class Solution {
    public int solution(int n) {
        // 6조각 모두 동일한 조각을 먹을 수 있는 피자판 개수
        int answer = 1;
        while (true){
            if(answer * 6 % n == 0){
                return answer;
            }
            answer++;
        }
    }
}