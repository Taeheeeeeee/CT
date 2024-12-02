class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] ab = new int[included.length];
        
        for(int i = 0; i < included.length; i++){
            ab[i] = a + (d * i);
            if(included[i]) answer += ab[i];
        }
        return answer;
    }
}