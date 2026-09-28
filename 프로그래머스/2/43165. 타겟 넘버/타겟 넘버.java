import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int solution(int[] numbers, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);

        for (int n : numbers) {
            Map<Integer, Integer> next = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : dp.entrySet()) {
                int sum = entry.getKey();
                int cnt = entry.getValue();

                int plus = sum + n;
                int minus = sum - n;

                next.put(plus, next.getOrDefault(plus, 0) + cnt);
                next.put(minus, next.getOrDefault(minus, 0) + cnt);
            }

            dp = next;
        }

        return dp.get(target);
    }
}