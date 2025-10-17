public class alien extends Lego {
    private String planet;

    public alien(String name, int age, String job, String planet){
        super(name, age, job);
        this.planet = planet;
    }

    public void whoAreYou(){
        System.out.println("My name is " + name + ", I am " + age + ", I am from " + planet + ", and I am a " + job + ".\n");
    }
    
}