import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 3; i <= numTerms; i++)
        {
            int nextTerm = first + second;
            System.out.print(", " + nextTerm);

            first = second;
            second = nextTerm;
        }

        scanner.close();
    }

}
