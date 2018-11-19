
import java.util.ArrayList;

public class Pattern {
    double jamRate;
    ArrayList<Stitch> patternStitches;

    public Pattern() {

    }
    public Pattern(double jamRate){
        this.jamRate = jamRate;
        patternStitches = new ArrayList<>();
    }

    public void addPatternStitch(Stitch currentStitch) {
        patternStitches.add(currentStitch);
    }

    public void printPattern () {
        boolean needleJam = false;
        int printLength = patternStitches.size();
        if (Math.random()< jamRate){
            needleJam = true;
            printLength = patternStitches.size()/2;

        }
        for (int i = 0; i < printLength; i++) {
           patternStitches.get(i).sew();
        }

    }


}





