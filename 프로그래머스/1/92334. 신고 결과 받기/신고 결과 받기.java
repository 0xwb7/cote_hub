import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int[] solution(String[] id, String[] report, int k) {
        int n = id.length;
        int[] answer = new int[n];
        int len = report.length;

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> r = new HashSet<>(Arrays.asList(report));

        for (String s : r) {
            String[] arr = s.split(" ");

            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

//        System.out.println(map);

        HashMap<String, Integer> cnt = new HashMap<>();

        for (String s : r) {
            String[] arr = s.split(" ");

            if (map.get(arr[1]) >= k) {
                cnt.put(arr[0], cnt.getOrDefault(arr[0], 0) + 1);
            }
        }

//        System.out.println(cnt);

        for (int i = 0; i < n; i++) {
            answer[i] = cnt.getOrDefault(id[i], 0);
        }

        return answer;
    }
}