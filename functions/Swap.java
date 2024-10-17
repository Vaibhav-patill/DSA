public class Swap {
    public static void Swapping(int a,int b){
         a=5;
         b=10;

        int temp=a;
        a=b;
        b=temp;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
       int a=5;
       int b=10; 
       Swapping(a, b);

    }
}

//call by value means making copy of original variable
//any changes done in function remains in it