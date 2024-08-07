public class Statickeyword{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.SchoolName="TKEA";

        Student s2=new Student();
        System.out.println(s2.SchoolName);

    }
    
}

class Student{

    String name;
    int roll;

    static String SchoolName;

    void setname(String name){
        this.name=name;
    }

    void SetRollNo(int roll){
        this.roll=roll;
    }
}
