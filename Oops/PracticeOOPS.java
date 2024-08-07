public class PracticeOOPS {
    //in java we cannot make a class private or protected
    public static void main(String[] args) {
        Vehicle s1=new Car();
        s1.print();

        Vehicle s2=new Vehicle();
        s2.print();

        Book b1=new Book(150);
        Book b2=new Book(250);
        System.out.println(Book.count);//we cant use Book.count beacause count is static variable and it can be called using class 
        

        
    }
}

class Vehicle{
    void print(){
        System.out.println("my vehicle");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("my car");
    }
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price=price;
        count++;
    }
}