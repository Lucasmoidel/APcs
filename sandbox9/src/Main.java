import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        try{
        File f = new File("/home/lucas/Documents/APcs/sandbox9/src/file.txt");
        Scanner s = new Scanner(f);
        File o = new File("/home/lucas/Documents/APcs/sandbox9/src/out.txt");
        PrintWriter p = new PrintWriter(o);
        while (s.hasNextLine()){
            String name = s.nextLine();
            p.println(name);

        }
        s.close();
        p.close();
        }catch(FileNotFoundException e){System.out.println("aaaaaaaaaaa");}
    }
}