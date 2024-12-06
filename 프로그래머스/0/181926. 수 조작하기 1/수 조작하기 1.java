class Solution {
    public int solution(int n, String control) {
        String[] split = control.split("");
        for(String s : split){
            switch (s){
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}