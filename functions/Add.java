import java.util.Scanner;

 class Add{
    public  static void add(int a,int b){//parameters:variables given during function defination
        System.out.println("Sum of two numbers is: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
       
        add(a, b);//arguments:variable given during function call
    }    
}
