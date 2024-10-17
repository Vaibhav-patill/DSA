//function is reusable part of code
import java.util.*;

public class Function {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void name(String firstName,String  lastName){
        
        System.out.println("Hello "+firstName+" "+lastName);
    }

    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        name(firstName,lastName);
        name("Vaibhav","Patil");
    }
}
