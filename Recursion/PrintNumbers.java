
public class PrintNumbers {
    public static void print_decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+",");
        print_decreasing(n-1);

    }

    public static void print_increasing(int n){
        if(n==1){
            System.out.print(n+",");
            return;
        }
        print_increasing(n-1);
        System.out.print(n+",");

    }
    public static void main(String[] args) {
        int n=10;  
        print_decreasing(n);
        System.out.println("");
        print_increasing(n);
    }
}
