public class Example{

    public static void main(String args []){
        //APPLYING CONSTRUCTOR
        Person student1 = new Person("Josh",30);
        Person student2 = new Person("Sandie",20);
        Person student3 = new Person("Daniel",16);
        Person student4 = new Person("Daren",9);  

        Animal animal1 = new Animal("Nala","Cat");
        Animal animal2 = new Animal("Gentle","Cat");
        Animal animal3 = new Animal("Cookie","Cat");
        Animal animal4 = new Animal("Minyan","Cat");

        animal1.attacks(student1.getName());
        animal2.attacks(student4.getName());
        animal3.attacks(student2.getName());
        animal4.attacks(student3.getName());


        //Animal 1 will attack Josh. but since Josh is in "Private", we use getName

        
        
       

        

        //student1.name="Josh"; .......use "Setter" to help during encapsulation of names to prevent error message
        //student1.setName("Josh");
        //student1.age=30;

        //System.out.println(student1.name);
        //System.out.println(student1.age);

        //System.out.println(student2.name);
        //System.out.println(student2.age);

        //student1.sayHello();
        //student2.sayHello();
        //Now Delete the say hellos


        //student2.name="Sandie";
        //student2.setName("Sandie");
        //student2.age=31;


        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        //variables

        student1.sayHello(student2.getName());

       /* int sum;

        sum = student1.getAge() + (student2.getAge());
        System.out.println(sum);*/
 


        

        //student1.sayHello();
        //student2.sayHello();






    }




}