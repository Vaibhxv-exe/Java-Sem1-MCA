import java.util.Scanner;


public class Task10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double totalSum = 0;


        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalSum += marks[i];
        }


        double average = totalSum / 5.0;
        String grade;


        if (average >= 90)
        {
            grade = "A";
        } else if (average >= 75)
        {
            grade = "B";
        } else if (average >= 50)
        {
            grade = "C";
        } else {
            grade = "Fail";
        }


        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);


        scanner.close();
    }
}
