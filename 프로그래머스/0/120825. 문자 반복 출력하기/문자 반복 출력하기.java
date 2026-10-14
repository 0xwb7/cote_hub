class Solution {
    public static String solution(String s, int n) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            ans += String.valueOf(s.charAt(i)).repeat(n);
        }

        return ans;
    }
}