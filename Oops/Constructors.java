public class Constructors {
    
    public static void main(String[] args) {
        Student s1= new Student("Vaibhav");
        System.out.println(s1.name);
        Student s2=new Student(5);
        System.out.println(s2.roll);
        Student s3=new Student();
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name=name;
        
    }

    // Student(){ // non parameterized constructor

    // }

    Student(){
        System.out.println("constructor is called");
    }

    Student(int roll){
        this.roll=roll;

    }
}