import java.util.Scanner;

public class CountByAnything
{
    public static void main(String [] args)
    {
        int counter = 0;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int interval = input.nextInt();
        int end = interval * 100;
        int lineInterval = interval * 10;

        while (counter < end){
            counter += interval;
            System.out.print(counter + " ");
            if (counter % lineInterval == 0){
                System.out.print("\n");
            }
        }
    }
}
