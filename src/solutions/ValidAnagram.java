package solutions;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        int length = s.length();
        int lengthTwo = t.length();

        if (length != lengthTwo) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1 );
            mapTwo.put(t.charAt(i), mapTwo.getOrDefault(t.charAt(i), 0) + 1 );
        }

        if (map.equals(mapTwo)) return true;
        else return false;

    }

}
