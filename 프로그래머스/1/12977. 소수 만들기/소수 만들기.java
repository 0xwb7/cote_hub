class Solution {
    
    static int answer;
    
    public static int solution(int[] n) {
        answer = 0;

        // 1 2 3, 1 2 4, 1 3 4, 2 3 4
        dfs(n, 0, 0, 0);

        return answer;
    }

    public static void dfs(int[] n, int start, int count, int sum) {
        if (count == 3) {
            if (isPrime(sum)) {
                answer++;
            }
            
            return;
        }

        for (int i = start; i < n.length; i++) {
            dfs(n, i + 1, count + 1, sum + n[i]);
        }
    }

    public static boolean isPrime(int sum) {
        if (sum < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }
}