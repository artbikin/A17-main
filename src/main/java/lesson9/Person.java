package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int year;

//    public Person(){}
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
//    public String getLastName(){
//        return this.lastName;
//    }
    public void setYear(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Year is wrong");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void printFullName(){
        System.out.println(this.name+" "+lastName);
    }
}
