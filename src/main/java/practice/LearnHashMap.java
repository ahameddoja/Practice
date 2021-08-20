package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public void AddHashmapValue() {
    HashMap<String,String> hashMap = new HashMap<>();
    hashMap.put("IE", "Internet Explorer");
    hashMap.put("CHROME", "Chrome Browser");
    hashMap.put("FIREFOX", "Mozilla Browser");
    hashMap.put("SAFARI", "IOS Browser");
    hashMap.put("OPERA", "Linux Browser");

    System.out.println("Browser Name: " +hashMap.get("IE"));
    System.out.println("----------------------------------");

    for(Map.Entry map: hashMap.entrySet()) {
        System.out.println(map.getKey() + ":" + map.getValue());
    }

  }

  public void hashMapWithDifferentDataType() {
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Vishal", 10);
    hashMap.put("Sachin", 30);
    hashMap.put("Sourav", 20);

    System.out.println("Size of map is: " + hashMap.size());
    System.out.println(hashMap);

    System.out.println(hashMap.get("Vishal"));
    hashMap.remove("Vishal");
    System.out.println(hashMap);
  }

}
