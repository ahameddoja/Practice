package homework2;

import java.util.HashMap;

public class Problem1 {
    public HashMap<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s));
            map.put(s, 0);
        }
        return map;
    }

}


