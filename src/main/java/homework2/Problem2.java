package homework2;

import java.util.HashMap;

public class Problem2 {
    public HashMap<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s,s.length());
        }
        return map;

    }

}
