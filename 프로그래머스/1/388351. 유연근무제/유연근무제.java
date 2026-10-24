class Solution {
    public static int solution(int[] s, int[][] t, int day) {
        int cnt = 0;

        for (int i = 0; i < s.length; i++) {
            int tmp = 0;
            int attendanceTime = 0;

            for (int j = 0; j < t[i].length; j++) {
                if (day == 6) {
                    tmp++;
                    day++;
                    continue;
                }

                if (day == 7) {
                    tmp++;
                    day = 1;
                    continue;
                }

                attendanceTime = s[i] + 10;

//                if (String.valueOf(attendanceTime).length() == 3) {
//                    if (Integer.parseInt(String.valueOf(s[i]).substring(1, 3)) >= 50) {
//                        attendanceTime += 40;
//                    }
//                } else {
//                    if (Integer.parseInt(String.valueOf(s[i]).substring(2, 3)) >= 50) {
//                        attendanceTime += 40;
//                    }
//                }

                if (attendanceTime % 100 >= 60) {
                    attendanceTime += 40;
                }

                if (attendanceTime >= t[i][j]) {
//                    System.out.println(attendanceTime + " " + t[i][j] + " " + day);
                    tmp++;
                }

                day++;
            }

            if (tmp == t[i].length) {
                cnt++;
            }
        }

//        System.out.println(cnt);
        return cnt;
    }
}