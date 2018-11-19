public class Bauble extends Pattern {

    private ShortLineStitch one;
    private CircleStitch two;

    public Bauble(){
        super(.0);
        this.one = new ShortLineStitch();
        this.two = new CircleStitch();

        for(int i = 0; i < 15; i++){
            this.patternStitches.add(i,one);
            i++;
            this.patternStitches.add(i,one);
            i++;
            this.patternStitches.add(i, two);

        }
    }
    public static void main(String[]args){
        Bauble Bauble = new Bauble();
        Bauble.printPattern();

    }
}
