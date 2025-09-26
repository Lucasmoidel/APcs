public class App {
    public static void main(String[] args){
        String[] names = new String[5];
        names[0] = "asfiqwmn";
        names[1] = "sadfk;q";
        names[2] = "dfrew";
        names[3] = "asdasd";
        names[4] = "yes";
        System.out.println(affermative(names));

    }
    public static String affermative(String[] s){
        String string = "";
        for (int i =0;i<s.length;i++){
            string+=s[i].substring(0, 2);
        }
        return string;
    }
}
