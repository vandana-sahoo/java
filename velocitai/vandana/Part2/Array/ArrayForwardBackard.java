//question --print int array forward and backward using for loop,while loop,do while loop.,for each for forward direction only and print length of array without using length method.

public class ArrayForwardBackard{
    public static void main(String[] args) {
     
        int[] intArray = {1, 2, 3, 4, 5};    //. Array of integers (int)

        System.out.println("Integer Array - Forward using for loop:");
        // Forward using for loop
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("Integer Array - Backward using for loop:");
        // Backward using for loop
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }

        System.out.println("Integer Array - Forward using while loop:");
        // Forward using while loop
        int i = 0;
        while (i < intArray.length) {
            System.out.println(intArray[i]);
            i++;
        }

        System.out.println("Integer Array - Backward using while loop:");
        // Backward  while loop
        i = intArray.length - 1;
        while (i >= 0) {
            System.out.println(intArray[i]);
            i--;
        }

        System.out.println("Integer Array - Forward using do-while loop:");
        // Forward do-while loop
        i = 0;
        do {
            System.out.println(intArray[i]);
            i++;
        } while (i < intArray.length);

        System.out.println("Integer Array - Backward using do-while loop:");
        // Backward  do-while loop
        i = intArray.length - 1;
        do {
            System.out.println(intArray[i]);
            i--;
        } while (i >= 0);

        System.out.println("Integer Array - Forward using for-each loop:");
        // Forward for-each loop
        for (int value : intArray) {
            System.out.println(value);
        }

        // Length of the array without using length property
        System.out.println("Length of Int Array (without using .length):");
        printArrayLength(intArray);
    }

    // array without  the .length property
    public static void printArrayLength(int[] array) {
        int count = 0;
        for (int i : array) {
            count++;
        }
        System.out.println("Array length: " + count);
    }
}
