package javaexam;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }
}
