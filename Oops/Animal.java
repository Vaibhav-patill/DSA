public class Animal {

    // Animal(){
    //     System.out.println("Animal lives in forest");
    // }

    // void eat(){
    //     System.out.println("eats");
    // }
    public static void main(String[] args) {
        // fish f=new fish();
        // f.eat();

        Horse m=new Horse();
        System.out.println(m.color);
        
    }
}

class Fish {
    
    String color;
     Fish(){
        System.out.println("fins");
     }

class Horse extends Fish{
    Horse(){
        //super();
        super.color="blue";
        System.out.println("Horse is for riding");
    }
}
}