class Solution {
    public static int[] solution(int[] n) {
        int[] reverse = new int[n.length];

        int j = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            reverse[j] = n[i];
            j++;
        }

        return reverse;
    }
}