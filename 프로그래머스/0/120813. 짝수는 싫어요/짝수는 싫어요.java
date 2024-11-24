class Solution {
    public int[] solution(int n) {
        int cnt = n % 2 != 0 ? n/2+1 : n/2;
        int[] answer = new int[cnt];
        int nn = 1;
        for(int i = 0; i < cnt; i++){
            answer[i] = nn;
            nn += 2;
        }
        
        return answer;
    }
}