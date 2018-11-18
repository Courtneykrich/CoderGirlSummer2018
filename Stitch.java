import java.util.ArrayList;

public class Stitch {
    private String name;
    private String asciiChar;
    private int asciiValue;

    public Stitch(String asciiChar){

        this.asciiChar = asciiChar;

    }
    public void sew(){
        System.out.print(asciiChar);
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getAsciiChar() {
//        return asciiChar;
//    }
//
//    public int getAsciiValue() {
//        return asciiValue;
//    }

    public static void main(String[]args){

        ShortLineStitch shortLine = new ShortLineStitch();
        shortLine.sew();
        SmallCrossStitch smallCross = new SmallCrossStitch();
        smallCross.sew();
        LargeCrossStitch largeCross = new LargeCrossStitch();
        largeCross.sew();
        CircleStitch circle = new CircleStitch();
        circle.sew();
        FillStitch fillStitch = new FillStitch();
        fillStitch.sew();
        BlockStitch block = new BlockStitch();
        block.sew();
        ZigZagStitch zigZag = new ZigZagStitch();
        zigZag.sew();

    }
}
