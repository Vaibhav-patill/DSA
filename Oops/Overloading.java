
import java.util.*;

public class Overloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
      // int j= c.sum(5, 66);
        System.out.println(c.sum(7,6));
        System.out.println(c.sum((float)3.2,(float)6.8));
        System.out.println(c.sum(7,6,8));
    }
    
}

class Calculator{
    int sum(int a,int b){
        
        return a+b;
    }

    int  sum(int a,int b,int c){
        
        return a+b+c;
    }

    float sum(float a,float b){
        
        return a+b;
    }
}
