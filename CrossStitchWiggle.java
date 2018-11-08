import java.util.ArrayList;

public class CrossStitchWiggle extends Pattern {
    protected ArrayList<Stitch> patternStitches;
    double jamRate;

    public CrossStitchWiggle(ArrayList<Stitch> patternStitches) {
        this.patternStitches = patternStitches;


        SmallCrossStitch first = new SmallCrossStitch("x");
        patternStitches.add(first);
        LargeCrossStitch second = new LargeCrossStitch("X");
        patternStitches.add(second);
        patternStitches.add(first);
        patternStitches.add(second);
        patternStitches.add(first);
        patternStitches.add(second);
        patternStitches.add(first);
        patternStitches.add(second);
        patternStitches.add(first);
        patternStitches.add(second);

    }

    public void printPattern() {
        for (int i = 0; i < patternStitches.size(); i++) {
            System.out.println(patternStitches);
        }
    }

    public static void main(String[] args) {


    }
}
//for(int i=10; i>1; i--){
//              System.out.println("The value of i is: "+i);