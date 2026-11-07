public class Task2
{
    public static void main(String[] args)
    {
        int celsius = 45;

        // Using 9.0 / 5 to prevent integer truncation during division
        double fahrenheit = (celsius * 9.0 / 5) + 32;
//declared a function and defined it


        System.out.println("Celsius Temperature : " + celsius + "°C");
        System.out.println("Fahrenheit Temperature : " + fahrenheit + "°F");
    }
}
