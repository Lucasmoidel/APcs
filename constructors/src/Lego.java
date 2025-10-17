public class Lego{

    protected String name;
    protected int age;
    protected String job;
    protected String hobby;
    protected boolean family;
    protected int height;

    public Lego(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Lego(String name, String hobby, boolean family, int height){
        this.name = name;
        this.hobby = hobby;
        this.family = family;
        this.height = height;
    }

    public void whoAreYou(){
        System.out.println("My name is " + name + ", I am " + age + ", and I am a " + job + ".\n");
    }

}