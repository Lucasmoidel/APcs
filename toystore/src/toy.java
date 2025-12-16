public class toy{
    private String name;
    private boolean disney;
    private boolean blackfriday;

    toy(String name, boolean disney, boolean blackfriday){
        this.name = name;
        this.disney = disney;
        this.blackfriday = blackfriday;
    }

    public String getName(){
        return this.name;
    }
    public boolean getDisney(){
        return this.disney;
    }
    public boolean getblackfriday(){
        return this.blackfriday;
    }
    public void setblackfriday(boolean blackfriday){
        this.blackfriday = blackfriday;
    }
}