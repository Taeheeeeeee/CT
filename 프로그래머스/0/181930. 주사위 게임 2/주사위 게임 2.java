class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int idx = 1;
        // 모두 다르면 a + b + c
        // 두개만 같으면 (a + b + c) × (a2 + b2 + c2 )
        // 세개 모두 같으면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )
        if(a == b || a == c || b == c) {
            idx++;
        }

        if(a == b && b == c){
            idx++;
        }

        for(int i = 1; i <= idx; i++) {
            answer *= (Math.pow(a,i)+Math.pow(b,i)+Math.pow(c,i));
        }

        return answer;
    }
}