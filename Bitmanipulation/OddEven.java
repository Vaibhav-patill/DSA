
import java.util.Scanner;

public class OddEven {
    public static void  oddOrEven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven();
        oddOrEven();
    }
}
