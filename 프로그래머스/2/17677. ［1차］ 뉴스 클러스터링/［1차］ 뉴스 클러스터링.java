import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        ArrayList<String> list1 = toList(str1);
        ArrayList<String> list2 = toList(str2);
        
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>(list1);
        
        for (String s : list2) {
            if (list1.contains(s)) {
                list1.remove(s);
                list.add(s);
            }
            
            union.add(s);
        }
        
        int size = union.size() - list.size();
        
        if (list1.size() == 0 && list2.size() == 0) {
            return 65536;
        } else {
            double n = (double) list.size() / size * 65536;
            return (int) n;
        }
    }
    
    public static ArrayList<String> toList(String str) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String tmp = str.substring(i, i + 2).toLowerCase();
            
            if ((int) tmp.charAt(0) < 97 || (int) tmp.charAt(0) > 122 
                || (int) tmp.charAt(1) < 97 || (int) tmp.charAt(1) > 122) {
                continue;
            } else {
                list.add(tmp);
            }
        }
        
        return list;
    }
}