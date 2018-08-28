import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String [] args)
    {
        System.out.println("Enter an even number or " + 999 + " to quit: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while (num != 999){
            if (num % 2 == 0){
                System.out.println("Good job");
            }

            System.out.println("Enter an even number or " + 999 + " to quit: : ");
            input = new Scanner(System.in);
            num = input.nextInt();
            }

        }
    }
