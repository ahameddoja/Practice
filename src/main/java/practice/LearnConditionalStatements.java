package practice;

public class LearnConditionalStatements {
    public void learnIfStatement(int x) {
        if (x < 20) {
            System.out.println("This is if statement");
        }
    }

    public void IfElseStatement(int x) {
        if (x < 20) {
            System.out.println("This is if statement");

        } else {
            System.out.println("This is else statement");
        }
    }

    public void learnNestedIfStatement(int x, int y) {
        if (x < 20) {
            if (y < 15) {
                System.out.println("X = " + x + " Y = " + y );
            }
        }
    }

    public void learnSwitchCase(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'c':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void calculateGrade(char grade) {
        if (grade == 'A' ) {
            System.out.println("Excellent");
        }else if (grade == 'B') {
            System.out.println("Well Done");
        }else if (grade == 'C') {
            System.out.println("Well Done");
        }else if (grade =='D') {
            System.out.println("You passed");
        }else if (grade == 'F') {
            System.out.println("Better try again");
        }else{
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }

    public void conditionalOperator() {
        int a,b;
        a = 10;

        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is: " + b);

//        if (a == 1) {
//            b = 20;
//        }else{
//            b = 30;
//        }
//        System.out.println("Value of b is: " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is: " + b);
    }

}


