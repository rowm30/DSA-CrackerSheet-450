package OOPS;

public class Q1 {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Q1(String name,String breed,int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    
    // Method 1
    public String getName(){
        return name;
    }

    // Method 2
    public String getBreed(){
        return breed;
    }

    // Method 3
    public int getAge(){
        return age;
    }

    // Method 4
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return("Hi my name is " + this.getName() + "\n My breed,age and color are " + this.getBreed() + "," + this.getAge() + this.getColor());
    }

    public static void main(String[] args){
        Q1 tuffy = new Q1("Tuffy", "papillion", 5, "White");
        System.out.println(tuffy.toString());
    }
}
