package execute;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    List<String> lists = new ArrayList<>();

    public void addValueToTheList() {
        lists.add("one");
        lists.add("Two");
        lists.add("Three");
    }

    public void readValueFromList() {
        System.out.println(lists);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println("Print value using for loop indexing: " + lists.get(i));
        }

        for (String list : lists) {
            System.out.println("Print value using for loop " + list);
        }

    }
        public void removeValueFromTheList() {
            lists.remove("Two");

        }

    }

