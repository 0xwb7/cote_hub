import java.util.ArrayList;

class Solution {
    public static int solution(int[] n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int len = n.length / 2;

        for (int i = 0; i < n.length; i++) {
            arr.add(n[i]);
        }

        long cnt = arr.stream()
                        .distinct()
                                .count();

        if (len < cnt) {
//            System.out.println(len);
            return len;
        } else {
//            System.out.println(cnt);
            return (int) cnt;
        }
    }
}