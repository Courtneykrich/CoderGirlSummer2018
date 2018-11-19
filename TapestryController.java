import java.util.ArrayList;

public class TapestryController {
    public TapestryController() {
    }

    public static void printBlocks(Pattern currentPattern, int rows, int columns ){

        for(int i = 0; i < rows; i++){
            System.out.println();
            for (int j = 0; j < columns; j++){
                currentPattern.printPattern();
            }

        }
        System.out.println();
        System.out.println();


    }

    public static void main(String[]args){

        CrossStitchWiggle newCrossWiggle = new CrossStitchWiggle();
        printBlocks(newCrossWiggle, 3, 8);
        printBlocks(newCrossWiggle, 8,6);

        ZigZagLines newZigZagLine = new ZigZagLines();
        printBlocks(newZigZagLine, 3, 8);
        printBlocks(newZigZagLine,8, 6);

        Bauble newBauble = new Bauble();
        printBlocks(newBauble,3, 8);
        printBlocks(newBauble,8,6);

        BlockyBauble newBlocky = new BlockyBauble();
        printBlocks(newBlocky,3,8);
        printBlocks(newBlocky,6,8);

        BrokenWiggle newBroken = new BrokenWiggle();
        printBlocks(newBroken,3,8);
        printBlocks(newBroken,8,6);
























    }

}
