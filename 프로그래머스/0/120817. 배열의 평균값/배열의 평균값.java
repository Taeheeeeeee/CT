class Solution {
    public double solution(int[] numbers) {
        
        double sum = 0;
        
        for(int n : numbers){
            sum += n;
        }
        double answer = sum / numbers.length;
        
        return answer;
    }
}