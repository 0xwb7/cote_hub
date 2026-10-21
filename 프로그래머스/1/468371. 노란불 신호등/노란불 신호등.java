class Solution {
    public static int solution(int[][] signals) {
        int limit = 1;

        for (int[] signal : signals) {
            limit *= signal[0] + signal[1] + signal[2];
        }

        for (int i = 1; i <= limit; i++) {
            boolean isYellow = false;

            for (int[] signal : signals) {
                int cycle = signal[0] + signal[1] + signal[2];
                int current = (i - 1) % cycle;

                if (current >= signal[0] && current < signal[0] + signal[1]) {
                    isYellow = true;
                } else {
                    isYellow = false;
                    break;
                }
            }

            if (isYellow) {
                return i;
            }
        }

        return -1;
    }
}