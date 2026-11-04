import java.util.*;

class Solution {
    public String solution(String m, String[] musicInfos) {
        
        String answer = "(None)";
        int maxDuration = Integer.MIN_VALUE;
        
        m = convert(m);
        
        for (String musicInfo : musicInfos) {
            String[] info = musicInfo.split(",");
            
            String start = info[0];
            String end = info[1];
            String title = info[2];
            String music = convert(info[3]);
            
            System.out.println(start + " " + end + " " + title + " " + music);
            
            int duration = getMin(end) - getMin(start);
            
            System.out.println(duration);
            
            String played = "";
            
            for (int i = 0; i < duration; i++) {
                played += music.charAt(i % music.length());
            }
            
            System.out.println(played);
            
            if (played.contains(m) && duration > maxDuration) {
                answer = title;
                maxDuration = duration;
            }
        }
        
        return answer;
    }
    
    public static String convert(String music) {
        return music
            .replace("C#", "c")
            .replace("D#", "d")
            .replace("F#", "f")
            .replace("G#", "g")
            .replace("A#", "a");
    }
    
    public static int getMin(String time) {
        String[] tmp = time.split(":");
        
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
}