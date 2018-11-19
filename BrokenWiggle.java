public class BrokenWiggle extends Pattern {

    private SmallCrossStitch one;
    private LargeCrossStitch two;

    public BrokenWiggle() {
        super(.4);
        this.one = new SmallCrossStitch();
        this.two = new LargeCrossStitch();


        for(int i= 0; i < 10; i++){
            this.patternStitches.add(i,one);
            i++;
            this.patternStitches.add(i,two);
        }

    }



    public static void main(String[] args) {
        BrokenWiggle brokenWiggle = new BrokenWiggle();
        brokenWiggle.printPattern();
    }

}


