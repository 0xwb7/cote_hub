class Solution {
    
    static boolean[] visited;
    
    public static int solution(int n, int[][] computers) {
        visited = new boolean[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(computers, n, i);
            }
        }

        return cnt;
    }

    public static void dfs(int[][] c, int n, int idx) {
        visited[idx] = true;

        for (int i = 0; i < n; i++) {
            if (c[idx][i] == 1 && !visited[i]) {
                dfs(c, n, i);
            }
        }
    }
}