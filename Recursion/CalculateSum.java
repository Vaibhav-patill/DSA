
public class CalculateSum {
    public static int calcSum(int n){

        if(n==1){
            return 1;
        }

        int sm1=calcSum(n-1);
        int sum=n+sm1;

        return sum;

    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("sum of n natural numbers: "+calcSum(n));
    }    
}
