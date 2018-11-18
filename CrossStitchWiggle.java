import java.util.ArrayList;

public class CrossStitchWiggle extends Pattern {

    private SmallCrossStitch one;
    private LargeCrossStitch two;

    public CrossStitchWiggle() {
        super(.05);
        this.one = new SmallCrossStitch();
        this.two = new LargeCrossStitch();
// above is defining the stitches for this pattern

        for(int i= 0; i < 10; i++){
            this.patternStitches.add(i,one);
            i++;
            this.patternStitches.add(i,two);
        }
        // adding the stitches to the arrayList
    }


    
    public static void main(String[] args) {
        CrossStitchWiggle crossWiggle = new CrossStitchWiggle();
        crossWiggle.printPattern();


    }



//    public static void printPattern(ArrayList<Stitch> crossWiggle) {
//        for (int i = 0; i < crossWiggle.size(); i++) {
//            System.out.print(crossWiggle.toString());
//        }
//    }
}
