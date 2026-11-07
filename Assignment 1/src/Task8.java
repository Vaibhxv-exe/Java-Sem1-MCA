import java.util.Scanner;


public class Task8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];


        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }


        System.out.println("\n--- Displaying Stored Marks ---");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Student " + (i + 1) + " Marks: " + marks[i]);
        }


        scanner.close();
    }
}
