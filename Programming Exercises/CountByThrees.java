public class CountByThrees
{
    public static void main(String [] args)
    {
        int counter = 0;
        final int END = 300;

        while (counter < END){
            counter += 3;
            System.out.print(counter + " ");
            if (counter % 30 == 0){
                System.out.print("\n");
            }
        }
    }
}
