import java.util.Scanner;


public class Task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter age: ");
        int age = scanner.nextInt();


        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();


        // Both conditions must be true to vote
        if (age >= 18 && isCitizen)
        {
            System.out.println("Result: Eligible to vote.");
        } else
        {
            System.out.println("Result: NOT eligible to vote.");
        }


        scanner.close();
    }
}
