
import java.util.ArrayList;

public abstract class Pattern {
    private String name;
    private float needleJamRate;
    private Stitch asciiChar;
    private ArrayList<Stitch> pattern;

    public Pattern(String name, float needleJamRate, ArrayList<Stitch> pattern){
        this.name = name;
        this.needleJamRate = needleJamRate;
        for (Stitch stitch : this.pattern = pattern) {

        }
        

    }

    public abstract void pattern();

}
