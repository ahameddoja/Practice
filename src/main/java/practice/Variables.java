package practice;

public class Variables {
    int salary = 2000;

    public void intVariables() {
        int salary = 1000;
        System.out.println("My Salary is: " + salary);
    }

    public void floatVariables() {
        float price = 25.50f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " Green light is: " + green);
    }

    public void charecterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet);
    }

    public void stringVariables() {
        String name = "John";
        String city = "Toronto";
        System.out.println("My name is: " + name + " My city is: " + city);
    }

    public void adamSalary() {
        System.out.println("My Salary is: " + salary);
    }

    public void davidSalary() {
        System.out.println("My salary is: " + salary);

    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }


}
