public class Main {
    public static void main(String[] args){
        Lego greg = new Lego("greg", "amateur radio", true, 5);
        Lego picard = new Lego("Jean Luc Picard", "fenceing", false, 99);
        Lego[] legos = {greg, picard};
        for (int i =  0;i < legos.length;i++){
            legos[i].whoAreYou();
        }
        getMoreInfo(legos);
    }
    
    public static void getMoreInfo(Lego[] legos){
        for (int i = 0; i < legos.length;i++){
            if (legos[i].getHobby()!= null){
                System.out.println(legos[i].getHobby());
            }
        }
    }
}
