import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public static int solution(String m, int[][] r) {
        String[] s = m.split(" ");
        int[][] sr = new int[s.length][2];

        int len = 0;
        for (int i = 0; i < s.length; i++) {
            len += s[i].length() + 1;

            sr[i][0] = len - s[i].length() - 1;
            sr[i][1] = len - 2;
        }

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < sr.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[j][1] >= sr[i][0] && r[j][0] <= sr[i][1]) {
                    list.add(s[i]);
                    s[i] = "";
                }

            }
        }

//        System.out.println(list);
//        System.out.println(Arrays.toString(s));

        for (String str : s) {
            set.add(str);
        }

//        System.out.println(set);
//        System.out.println();

        int cnt = 0;
        for (String str : list) {
            if (set.add(str)) {
//                System.out.println(str);
                cnt++;
            }
        }

        return cnt;
    }
}