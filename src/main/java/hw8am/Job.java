package hw8am;

public class Job {

    public String industry;
    public String role;
    public int yoe;
    public int salary;

    public void hello(String name){
        System.out.println("Hello, my name is "+name+". I am a "+role+" in the "+industry+" industry with "+yoe+" years of experience. I make $"+salary+" per year.");
    }
}


