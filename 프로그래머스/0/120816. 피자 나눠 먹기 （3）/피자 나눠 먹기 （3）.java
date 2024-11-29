class Solution {
    public int solution(int slice, int n) {
        return (n / slice) + ((n % slice) >= 1 ?  1 : 0);
    }
}