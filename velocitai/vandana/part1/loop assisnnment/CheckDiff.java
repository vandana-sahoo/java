
//diff between sum of all even number and product of odd number.

class Check {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;

        int sumEven = 0;
        int productOdd = 1;

        // Calculating sum of all even numbers and product of all odd numbers from m to n
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                productOdd *= i;
            }
        }

        // Difference between sum of even numbers and product of odd numbers
        int difference = sumEven - productOdd;

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);
        System.out.println("Difference between sum of even numbers and product of odd numbers: " + difference);
    }
}
