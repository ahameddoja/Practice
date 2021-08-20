package execute;

public class LearnStringMethods {
    public void learnIndexOf() {
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("e", 5));
    }

    public void learnSubString() {
        String str = "JavaPoint";
        System.out.println(str.substring(2));
        System.out.println(str.substring(0, 4));

        String myStr = "Hello planet earth, you are a great planet";
        int indexNumber = myStr.indexOf("earth");
        //System.out.println(indexNumber);
        System.out.println(myStr.substring(indexNumber, indexNumber + 5));
    }

    public void learnLength() {
        String str = "JavaPoint";
        System.out.println(str.length());
    }

    public void learnReplace() {
        String str = "Hello";
        //System.out.println(str.replace('l', 'p'));

        String mystr = "My name is Adam";
        System.out.println(mystr.replaceAll("Adam", "David"));

    }

    public void learnTream() {
        String mystr = "       Hello World       ";
        System.out.println(mystr);
        System.out.println(mystr.trim());
    }

    public void learnConvertCase() {
        String actualValue = "HELLO";
        String expectedValue = "HELLO";

        if (actualValue.equals(expectedValue.toUpperCase())) {
            System.out.println("this is true");
            //if (expectedValue.equals(actualValue.toLowerCase())) {
            //System.out.println("this is true");

        }
    }

    public void learnCharAt() {
        String str = "Hello";
        char result = str.charAt(0);
        System.out.println(result);
    }
    //Print a word in reverse order
    // adam -> mada
    //hello -> olleh

    public void printReverseString(String str) {
        //length()
        //Index number
        //Loop

        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char alphabet = str.charAt(i);
            reverseWord += String.valueOf(alphabet);
        }
        System.out.println(reverseWord);
    }

    public void learnValueOf() {
        int value = 10;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10);
    }

    public void learnFormat() {
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;
        String duration = "yearly";
        //System.out.println("My name is " + name + ",I am " + age + " years old and my salary is $" + salary + " yearly");
        //System.out.println(String.format("My name is %s and I am %d years old and my salary is $%d %s", name, age, salary, duration));
    }

    public void learnFormatInArray() {
        String[] name = {"Jonathan", "Robert", "Oliver"};
        int[] age = {20, 30, 40};
        int[] salary = {20000, 30000, 40000};

        for (int i = 0; i < name.length; i++) {
            String sentence = String.format("My name is %s and I am %d years old and my salary is $%d yearly", name[i], age[i], salary[i]);
            System.out.println(sentence);
        }
    }

    public void learnContains() {
        String sentence = "My name is Robert";
        System.out.println(sentence.contains("Ro"));
        System.out.println(sentence.contains("be"));
        System.out.println(sentence.contains("Rt"));
    }

    public void learnsplit() {
        String names = " John, Mathew, Ali, Abraham";
        String[] arrNames = names.split(",");
        for (String name : arrNames) {
            System.out.println("Person Name is: " + name);
        }
    }

    //Word[0] = I
    //Word[1] = live
    //Word[2] = in
    //Word[3] = New
    //Word[4] = York

    public void learnsplitArray() {
        String sentence = "I live in New York";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println("Word is: " + word);
    }

        //York New in live I - print in reverse order

        String reverse = "";

        for(int i = words.length - 1; i>= 0; i--) {
            //reverse = reverse + words[i];
            reverse += words[i] + " ";
    }
        System.out.println("Reverse Sentence is: " + reverse);
    }

}
