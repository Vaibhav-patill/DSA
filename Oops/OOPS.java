public class OOPS{
    public static void main(String[] args){

     Pen p1=new Pen(); // created object p1;//objrcts are entities in real world
     Student p2=new Student();
    // p2.calcPercentage(4,3, 5);
     p2.percent=5;
     System.out.println(p2.percent);
     p1.newcolor("Blue");
     System.out.println(p1.color);        
     p1.newtip(6);
     System.out.println(p1.tip);
     p1.color="yellow";
     System.out.println(p1.color);
     Bankaccount myacc=new Bankaccount();
     myacc.username="Vaibhav";
     myacc.setpassword("123456787");
    }
}

class Bankaccount{ // class is group of these entities
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }
}

class Pen{
    String color;
    int tip;

    void newcolor(String setcolor){
        color=setcolor;

    }

    void newtip(int settip){
        tip=settip;
    }
}

class Student{
    String name;
    int age;
    float percent;

    void calcPercentage(int phy,int chem,int math){
        percent=(phy+chem+math)/3;
    }
}


/*there are two types of memories in java :stack and heap
all objects are created inside heap

Getters and setters :
Get :returns the value 
*/