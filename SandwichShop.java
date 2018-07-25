import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies=50;
        int goalForBurgers=250;
        int goalForSubs=180;
        int goalForSoup=70;
        boolean veggies = (goalForVeggies> 50);
        boolean burgers = (goalForBurgers> 250);
        boolean subs= (goalForSubs> 180);
        boolean soup= (goalForSoup> 70);

        out.println("Checking Sales Goals");
        out.println();
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        goalForVeggies = keyboard.nextInt();
        if (veggies)
        {
            out.println("Made goal!");
        } else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for burgers is "+ goalForBurgers);
        out.println("How many burger were sold today?");
       goalForBurgers=keyboard.nextInt();
        if (burgers)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for subs is "+goalForSubs);
        out.println("How many subs were sold today?");
        goalForSubs=keyboard.nextInt();
        if (subs)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for soup is "+goalForSoup);
        goalForSoup=keyboard.nextInt();
        if (soup)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        if ((veggies) && (burgers) && (subs) && (soup))
        {
            out.println("Made goals for everything today!");
        }
        else
            out.println("Fell Short of all goals.");

    }
}
