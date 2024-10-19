public class Oops {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.print(p1.color);

        Student s1=new Student();
        s1.name="Vaibhav Patil";
        System.out.println("\nHi I am "+s1.name);
        s1.age=20;
        System.out.println("My age is "+s1.age);
        s1.calcPercenatage(90,99,95);
        System.out.println(s1.percentage);

    }
}

class  Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercenatage(int phy,int chem,int eng){
        percentage=(phy+chem+eng)/3;
    }

}
