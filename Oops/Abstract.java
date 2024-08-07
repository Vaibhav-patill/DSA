public class Abstract {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        
        System.out.println(h.colour);
        h.changecolor();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        
    }
    
}

 abstract class Animal{
    String colour;
     Animal(){
        
        colour="brown";
     }         
    void eat(){
        System.out.println("can eat");
    }

    abstract void walk();
 }

 class Horse extends Animal{
    public static final char[] color = null;
    void changecolor(){
        colour="black";
        System.out.println(colour);
    }
    void walk(){
        System.out.println("horse can walk");
    }
 } 

class Chicken extends Animal{
    void changecolor(){
        colour="dark brown";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
