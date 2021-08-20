package practice;

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
        System.out.println(indexNumber);
        System.out.println(myStr.substring(indexNumber, indexNumber + 5));
    }

    public void learnLength() {
        String str = "JavaPoint";
        System.out.println(str.length());
    }

    public void learnReplace() {
        String str = "Hello";
        System.out.println(str.replace("l", "p"));

        String myStr = "My name is Adam";
        System.out.println(myStr.replaceAll("Adam", "David"));
    }

    public void learnTrim() {
        String myStr = "    My name is Adam     ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

    }

    public void learnConvertCase() {
        String actualValue = "HELLO";
        String expectedValue = "hello";

        if (expectedValue.equals(expectedValue.toLowerCase())) {
            System.out.println("This is True");
        }
    }

    public void learnChraAt() {
        String str = "Hello";
        char result = str.charAt(0);
        System.out.println(result);
    }

    //Print a word in reverse order
    //adam -> mada
    //hello -> olleh

    public void printReverseString(String str) {
        //length
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

    //"My name is Jonathan and I am 20 years old and my salary is $40000 yearly"
    public void learnFormat() {
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;
        String duration = "yearly";
        System.out.println("My name is: " + name + " and I am " + age + " years old and my salary is $ " + salary + " yearly");
        System.out.println(String.format("My name is %s and I am %d years old and my salary is $%d %s", name, age, salary, duration));
    }

    public void learnContains() {
        String sentence = "My name is Robert";
        System.out.println(sentence.contains("Albert"));
    }

    public void learnSplit() {
        String names = "John,Ali,Mathew,Abraham";
        String[] arrNames = names.split(",");
        for (String name : arrNames) {
            System.out.println("Person name is: " + name);
        }
    }

    public void learnSplitArray() {
        String sentence = "I live in Toronto";
        String[] words = sentence.split(" ");

        //words[0] = I
        //words[1] = live
        //words[2] = in
        //words[3] = New
        //words[4] = York


        for(String word : words) {
            System.out.println("Word is: " + word);
        }

        //York New in live I - print in reverse order
        String reverse = "";

        for(int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        System.out.println("Reverse Sentence is: " + reverse);
    }
}
