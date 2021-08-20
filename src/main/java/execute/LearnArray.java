package execute;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    public void stringArray() {
        String[] mylist = {"Ontario", "Quebec", "Nova Scotia", "Alberta", "British Columbia", "Manitoba"};
        for (int i = 0; i < mylist.length; i++) {
            System.out.println("Province name is: " + mylist[i]);
        }
    }

    public void sortArray() {
        String[] mylist = {"Ontario", "Quebec", "Nova Scotia", "Alberta", "British Columbia", "Manitoba"};
        Arrays.sort(mylist);
        System.out.println(Arrays.toString(mylist));
    }

    public void sortArrayInDecendingOrder() {
        String[] mylist = {"Ontario", "Quebec", "Nova Scotia", "Alberta", "British Columbia", "Manitoba"};
        Arrays.sort(mylist, Collections.reverseOrder());
        System.out.println(Arrays.toString(mylist));
    }

}



