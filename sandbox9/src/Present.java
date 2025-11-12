import java.util.Scanner;
import java.util.ArrayList;
public static ArrayList<Present> Sam;

public class Present {
    private String type;
    private double size;
    private double weight;
    private boolean wrapped;

    public Present(String type, double size, double weight, boolean wrapped){
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.wrapped = wrapped;
    }

    public double getSize(){
        return this.size;
    }

    public String getType(){
        return this.type;
    }

    public double getweight(){
        return this.weight;
    }

    public void setWrpapped(boolean wrapped){
        this.wrapped = wrapped;
    }
    public static void main(String[] args){
     Sam.add(new Present("lego", 12, 5, true));   
    }
}