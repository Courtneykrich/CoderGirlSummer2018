import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        String item1;
        String item2;
        String item3;
        out.println("Please list three items for your shopping trip.");
        item1= keyboard.next();
        item2= keyboard.next();
        item3= keyboard.next();
        int num1;
        int num2;
        int num3;
        float pr1;
        float pr2;
        float pr3;
        out.println("How many " +item1+ " do you need to purchase?");
        num1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many " +item2+ " do you need to purchase?");
        num2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many " +item3+ " do you need to purchase?");
        num3 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("What is the cost per "+ item1+"?");
        pr1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("What is the cost per "+item2+"?");
        pr2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("What is the cost per "+item3+"?");
        pr3 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("Your total grocery bill will be ...");
        out.print((num1*pr1)+(num2*pr2)+(num3*pr3));



    }
}
