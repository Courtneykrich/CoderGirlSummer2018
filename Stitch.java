public class Stitch {
    private String name;
    private String asciiChar;
    private int asciiValue;


   // private ArrayList<Stitch> allStitch = new ArrayList<Stitch>(7);


    public Stitch(String name, String asciiChar){
        this.name = name;
        this.asciiChar = asciiChar;
        //this.asciiValue = asciiValue;
    }
    public void sew(){
        System.out.println(asciiChar);
    }

    public String getName() {
        return name;
    }

    public String getAsciiChar() {
        return asciiChar;
    }

    public int getAsciiValue() {
        return asciiValue;
    }

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
