public class Weekday {
    public static void main(String[] args) {

        int dayNumber = 3; // Replace this with any number between 1 and 7

        switch(dayNumber) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid number! Please enter a number between 1 and 7.");
        }
    }
}





