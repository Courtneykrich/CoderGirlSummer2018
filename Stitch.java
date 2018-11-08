import java.util.ArrayList;

public class Stitch {
    private String name;
    private String asciiChar;
    private int asciiValue;

    public Stitch(String asciiChar){
        //this.name = name;
        this.asciiChar = asciiChar;

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
        Stitch shortLine = new Stitch("-");
        //allStitch.add(shortLine);
        shortLine.sew();
        Stitch smallCross = new Stitch("x");
        smallCross.sew();
        Stitch largeCross = new Stitch("X");
        largeCross.sew();
        Stitch circle = new Stitch("o");
        circle.sew();
        Stitch fill = new Stitch("=");
        fill.sew();
        Stitch block = new Stitch("[]");
        block.sew();
        Stitch zigZag = new Stitch("Z");
        zigZag.sew();

    }
}
