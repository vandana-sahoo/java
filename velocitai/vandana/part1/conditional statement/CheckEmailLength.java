
public class CheckEmailLength {
    public static void main(String[] args) {
        String email = "example@gmail.com";  // Replace with the email ID you want to check

        // Using the conditional operator to check if the email length is minimum
        String message = (email.length() >= 5) ? "Email ID is of minimum length." : "Email ID is too short.";
        
        System.out.println(message);
    }
}
