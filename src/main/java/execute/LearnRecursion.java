package execute;

public class LearnRecursion {
    // Sum of a range of numbers
    //Input = 10
    //Sum = 1+2+3+4+5+6+7+8+9+10 => 55

    public int sumRangeOfNumbers(int k) { // 2
        if (k > 0) {
            return k + sumRangeOfNumbers(k - 1); // 2 + 1
        } else {
          return 0;
        }
    }
}

