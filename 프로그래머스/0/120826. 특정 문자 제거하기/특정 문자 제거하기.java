class Solution {
    public static String solution(String s, String letter) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(letter)) {
                continue;
            }

            ans += s.charAt(i);
        }

        return ans;
    }
}