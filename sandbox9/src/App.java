import java.util.Scanner;
public class App {
    public static void main(String[] args){
        for (int  i = 0; i < 20; i++){
            System.out.println((int)(Math.random()*22));
        }
    }
    public static String names(String[] names){
        String str = "";
        for (int i = 0; i<names.length-1; i++){
            while (names[i]!=null){
                str+= names[i] + " and ";
            }
        }
        while (names[names.length-1]!=null){
            str+=names[names.length-1];
        }
        return str;
    }
    public static int ints(int[] nums){
        int largest = 0;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] > largest){
                nums[i] = largest;
            }
        }
        return largest-2;
    }
    public static String words(String[] words){
        String str = "";
        for (int i = 0; i<words.length; i++){
            if (words[i].contains("b")){
                str+= words[i] + " ";
            }
        }
        return str;
    }
}