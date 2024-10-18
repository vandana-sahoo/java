import java.util.Scanner;

class StudentDetails
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No");
        int rollno  = sc.nextInt();

        System.out.println("Enter First Name");
        String fname = sc.next();

        System.out.println("Enter Last Name");
        String lname = sc.next();

        System.out.println("Enter Passing Year");
        int pyear = sc.nextInt();

        System.out.println("Enter Address");
        String address = sc.nextLine();

        sc.nextLine();

        System.out.println("Roll No: " + rollno);
        System.out.println("First Name & Last Name: " + fname +lname);
        System.out.println("Year of Passing: " + pyear);
        System.out.println("Address: " + address);
       

    }
}
