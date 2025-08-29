import java.util.Scanner;
public class Exercise5
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        if (scanner.hasNextInt ())
        {
            int age = scanner.nextInt ();
            if (age >= 1 && age <= 130)
            {
                System.out.println("The age entered is valid.");
            }
            else
            {
            System.out.println("The age entered is invalid. It must be between 1 and 130.");
            }
        }
        else
        {
        System.out.println("That ’s not a valid number!");
        }
    }
}
