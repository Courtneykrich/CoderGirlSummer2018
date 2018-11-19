public class ZigZagLines extends Pattern {

    private ZigZagStitch one;
    private FillStitch two;

    public ZigZagLines() {
        super(0.0);
        this.one = new ZigZagStitch();
        this.two = new FillStitch();

        for (int i = 0; i < 12; i++) {          // making the ArrayList 12 elements long
            this.patternStitches.add(i, one);
            i++;
            this.patternStitches.add(i, one);
            i++;
            this.patternStitches.add(i, one);
            i++;
            this.patternStitches.add(i, two);
            i++;
            this.patternStitches.add(i, two);
            i++;
            this.patternStitches.add(i, two);

            }

    }





        public static void main (String[]args){
            ZigZagLines ZigLine = new ZigZagLines();
            ZigLine.printPattern();

        }

}

