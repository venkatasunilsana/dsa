package arrays;

public class Playground {
    static void main() {
        int inputNumber = 5;
       printFibonacciIterative(inputNumber);
        printFibonacciRecursive(inputNumber);
    }

    // Time complexity = O(N)
    public static void printFibonacciIterative(int lengthOfSeries) {
        int previousNum = 0;
        int currentNum = 1;

        for (int counter = 1; counter <= lengthOfSeries; counter++) {
            if (counter == 1) {
                System.out.print(0 + " ");
                continue;
            }

            if (counter == 2) {
                System.out.print(1 + " ");
                continue;
            }

            if (counter > 2) {
                int nextNum = previousNum + currentNum;
                System.out.print(nextNum + " ");

                previousNum = currentNum;
                currentNum = nextNum;
            }
        }
    }

    // Time complexity = (2^N)
    public static void printFibonacciRecursive(int lengthOfSeries) {
        for(int counter = 0; counter < lengthOfSeries; counter++) {
            System.out.print(fibonacci(counter) + " ");
        }
    }

    public static int fibonacci(int inputNumber) {
        if (inputNumber <= 1)
            return inputNumber;

        return fibonacci(inputNumber-1) + fibonacci(inputNumber-2);
    }
}