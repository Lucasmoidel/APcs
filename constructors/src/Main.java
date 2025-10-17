public class Main {
    public static void main(String[] args){
        Lego bob = new Lego("bob", "amateur radio", true, 5);
        Lego picard = new Lego("Jean Luc Picard", 78, "star ship captain");
        alien greg = new alien("greg", 9999, "construction worker", "Mars");

        Lego[] box = new Lego[3];
        box[0] = bob;
        box[1] = picard;
        box[2] = (Lego)greg;
        for (int  i = 0;i< box.length;i++){
            if (box[i]!=null){
                box[i].whoAreYou();
            }
        }
    }
}
