public class Copyconstructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Vaibhav";
        s1.roll=29;
        s1.password="abc";

        Student s2=new Student(s1);//copy 
        s2.password="abcd";


    }
}

class Student{
    String name;
    int roll;
    String password;

    //copy constructor;
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }

    Student(String name){
        this.name=name;
        
    }

    Student(){
        System.out.println("constructor is called");
    }

    Student(int roll){
        this.roll=roll;

    }
}
