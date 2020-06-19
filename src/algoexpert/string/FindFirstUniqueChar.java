package algoexpert.string;

import java.util.Arrays;
import java.util.HashMap;

public class FindFirstUniqueChar {

    public static void test() {
        String s = "loveleetcode";
        int min = solution(s);
        System.out.println(min);
    }

    private static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if(!map.containsKey(current)){
                map.put(current, i);
            }else{
                map.put(current, -1);
            }
        }

        int min = Integer.MAX_VALUE;

        for(char c : map.keySet()){
            if(map.get(c) < min && map.get(c) > -1){
                min = map.get(c);
            }
        }

        return min;
    }
}
