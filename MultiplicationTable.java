import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to Multiplication my Table");
        System.out.println();
        System.out.println("How high would you like to see me multiple?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        printMultiplicationTable(size);


    }


    public static void printMultiplicationTable(int size) {
        System.out.println("Multiplication table for " + size);

        for(int i = 0; i <= size; i++)
        {
            for(int j = 0; j<=size; j++)
            {
                System.out.println(i + "*" + j+ "=" + i*j);
            }
        }



    }
}