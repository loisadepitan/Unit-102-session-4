public class Person{
    //Attributes
    private String name;
    public int age;
    public int points;  


    //mthod..public: visibility of data. Void: A value to return BUT THRES NOTHING TO return. "sayHello" is a name for the method. Now lets go ahead and return the AGE.
    
    //constructor will help with visibility of data
    
    public Person(String name, int age){
        this.name=name;
        this.age=age;
        this.points=100;

    }
    //then create a method. A method can return something
    public void setName(String name){
        this.name=name;
        //this.name on ln 9 is the same as name on ln 3 while =name on ln String name on line 8

    }
    public String getName(){
        return this.name;
    }
    //Use  the word "this" for things to work properly.



    public void sayHello(String friend){
        System.out.println("Hello " + friend);
        

    }

    //instead of creating many codes for many attributes and several people, use the "method"

    public void printP(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.points);
        //everyone gets 100 points
    }
    //We use public to return the age.

    public int getAge(){
        return this.age;


    }

    



}