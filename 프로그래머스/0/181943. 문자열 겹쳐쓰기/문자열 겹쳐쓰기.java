class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int msLen = my_string.length();
        int osLen = overwrite_string.length();

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + osLen, msLen);
        return answer;
    }
}