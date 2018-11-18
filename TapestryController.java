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


    }

    public static void main(String[]args){
//        TapestryController intance = new TapestryController();

        CrossStitchWiggle newCrossWiggle = new CrossStitchWiggle(.05);
        printBlocks(newCrossWiggle, 3, 8);
        System.out.println();
        System.out.println();
        System.out.println();
        printBlocks(newCrossWiggle, 8,6);








//        ArrayList<Stitch> crossWiggle= new ArrayList<Stitch>();
//
//        CrossStitchWiggle one = new CrossStitchWiggle(.05);
//
//        crossWiggle.add(new SmallCrossStitch());
//        crossWiggle.add(new LargeCrossStitch());
//        crossWiggle.add(new SmallCrossStitch());
//        crossWiggle.add(new LargeCrossStitch());
//        crossWiggle.add(new SmallCrossStitch());
//        crossWiggle.add(new LargeCrossStitch());
//        crossWiggle.add(new SmallCrossStitch());
//        crossWiggle.add(new LargeCrossStitch());
//        crossWiggle.add(new SmallCrossStitch());
//        crossWiggle.add(new LargeCrossStitch());
//
//        CrossStitchWiggle.printPattern(crossWiggle);








    }

}
