import java.util.Arrays;

class Solution {
    public static int solution(int[] p, int l) {
        Arrays.sort(p);

        int firstIndex = 0;
        int lastIndex = p.length - 1;
        int cnt = 0;

        while (true) {
            if (p[firstIndex] + p[lastIndex] <= l) {
                cnt++;
                firstIndex++;
                lastIndex--;
            } else {
                cnt++;
                lastIndex--;
            }

            if (firstIndex > lastIndex) {
//                System.out.println(cnt);
                return cnt;
            }
        }
    }
}