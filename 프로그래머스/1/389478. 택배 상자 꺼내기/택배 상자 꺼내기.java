class Solution {
    public static int solution(int n, int w, int num) {
        int h = (int) Math.ceil((double) n / w);

        int[][] box = new int[h][w];

        int firstIdx = 0;
        int lastIdx = 0;

        for (int i = 0; i < n; i++) {
            int row = i / w;
            if (row % 2 == 0) {
                box[row][i % w] = i;

                if (i + 1 == num) {
                    firstIdx = row;
                    lastIdx = i % w;
                }
            } else {
                box[row][w - (i - (row * w)) - 1] = i;

                if (i + 1 == num) {
                    firstIdx = row;
                    lastIdx = w - (i - (row * w)) - 1;
                }
            }
        }

        if (box[h - 1][lastIdx] == 0) {
            return h - firstIdx - 1;
        } else {
            return h - firstIdx;
        }
    }
}