import java.util.ArrayList;

public class Stitch {
    private String name;
    private String  asciiChar;
    //private int asciiValue;
   // private ArrayList<Stitch> allStitch = new ArrayList<Stitch>(7);


    public Stitch(String name, String asciiChar){
        this.name = name;
        this.asciiChar = asciiChar;
        //this.asciiValue = asciiValue;
    }
    static Stitch firstStitch = new Stitch("ShortLineStitch","-");

    public String toString(){
        return this.asciiChar;
    }
    public void sew(){
        System.out.println(asciiChar);
    }
    public static void main(String[]args){
        firstStitch.sew();
    }

}
