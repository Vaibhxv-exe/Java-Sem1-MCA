import java.util.Scanner;


public class Task9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];


        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }


        System.out.println("Maximum value in the array is: " + max);


        scanner.close();
    }
}
