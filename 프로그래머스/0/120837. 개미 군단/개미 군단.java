class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 장군5, 병정3, 일1
        int general = 5;
        int solider = 3;
        int ant = 1;
        
        answer += hp / general;
        answer += (hp % general) / solider;
        answer += (hp % general) % solider;
        
        return answer;
    }
}