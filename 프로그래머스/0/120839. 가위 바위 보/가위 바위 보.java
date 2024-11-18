class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] r = rsp.split("");
        for(String a : r){
            answer += a.equals("2") ? "0" : a.equals("0") ? "5" : "2";
        }
        return answer;
    }
}