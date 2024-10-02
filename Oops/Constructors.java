public class Constructors {
    
    public static void main(String[] args) {
        Student s1= new Student("Vaibhav");
        System.out.println(s1.name);
        Student s2=new Student(5);
        System.out.println(s2.roll);
        Student s3=new Student("Vaibhav",27);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name=name;
        
    }

    Student(){
        System.out.println("constructor is called");
    }

    Student(int roll){
        this.roll=roll;

    }

     Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    
}