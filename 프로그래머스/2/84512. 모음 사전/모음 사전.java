class Solution {
    
    static int answer;
    static String[] word = {"A", "E", "I", "O", "U"};
    
    public static int solution(String s) {
        answer = 0;
        
        dfs(s, "");

        return answer;
    }

    public static boolean dfs(String s, String recent) {
        if (!recent.isEmpty()) {
            answer++;

            if (recent.equals(s)) {
                return true;
            }
        }

        if (recent.length() == 5) {
            return false;
        }

        for (int i = 0; i < word.length; i++) {
            if (dfs(s, recent + word[i])) {
                return true;
            }
        }

        return false;
    }
}