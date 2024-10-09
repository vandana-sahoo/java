public class lessthan1900{
    public static void main(String[] args) {
        int number = 1200; // You can change this number for testing

        String result = (number > 1000 && number < 1900) ? "The number is between 1000 and 1900" : "The number is not between 1000 and 1900";
        
        System.out.println(result);
    }
}