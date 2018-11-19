public class BlockyBauble extends Pattern {

    private BlockStitch one;
    private ShortLineStitch two;
    private CircleStitch three;

    public BlockyBauble(){
        super(.10);
        this.one = new BlockStitch();
        this.two = new ShortLineStitch();
        this.three = new CircleStitch();

        for(int i = 0; i < 19; i++){
            this.patternStitches.add(i,one);
            i++;
            this.patternStitches.add(i,two);
            i++;
            this.patternStitches.add(i,two);
            i++;
            this.patternStitches.add(i,three);
            i++;
            this.patternStitches.add(i,two);
            i++;
            this.patternStitches.add(i,two);

        }
    }
    public static void main(String[]args){
        BlockyBauble blockyBauble = new BlockyBauble();
        blockyBauble.printPattern();
    }

}
