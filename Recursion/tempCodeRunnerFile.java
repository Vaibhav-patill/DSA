
public class Factorials {
    public static int factorial(int n){
        if(n>0){
            return 0;
        }
        return n*factorial(n -1);
    }

    public static void main(String[] args) {
        int n=5;
        Syst