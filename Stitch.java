import java.util.ArrayList;


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
}
