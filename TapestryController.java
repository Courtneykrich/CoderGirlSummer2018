public class TapestryController {
    public static void main(String[]args){

        Stitch shortLine = new Stitch("ShortLineStitch", "-");
        shortLine.sew();
        Stitch smallCross = new Stitch("SmallCrossStitch","x");
        smallCross.sew();
        Stitch largeCross = new Stitch("LargeCrossStitch","X");
        largeCross.sew();
        Stitch circle = new Stitch("CirleStitch","o");
        circle.sew();
        Stitch fill = new Stitch("FillStitch","=");
        fill.sew();
        Stitch block = new Stitch("BlockStitch","[]");
        block.sew();
        Stitch zigZag = new Stitch("ZigZagStitch","Z");
        zigZag.sew();



    }

}
