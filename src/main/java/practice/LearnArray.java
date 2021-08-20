package practice;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    public void stringArray() {
        String[] myList = {"Ontario", "Quebec", "Nova Scotia","Alberta"};
        for(int i = 0; i < myList.length; i++) {
            System.out.println("Province name is: " + myList[i]);
        }
    }

    public void sortArray() {
        String[] myList = {"Ontario", "Quebec", "Nova Scotia","Alberta"};
        Arrays.sort(myList);
        System.out.println(Arrays.toString(myList));
    }

    public void sortArrayInDecendingOrder() {
        String[] myList = {"Ontario", "Quebec", "Nova Scotia","Alberta"};
        Arrays.sort(myList,Collections.reverseOrder());
        System.out.println(Arrays.toString(myList));
    }
}
