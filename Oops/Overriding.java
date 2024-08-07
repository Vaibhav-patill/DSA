public class Overriding {
    public static void main(String args[]){
       Animal e=new Animal();
       e.eat();
    
     }
}


class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}