public class Check {

    public static void oddorEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.err.println("even number");
        }else{
            System.err.println("odd number ");
        }
    }
 public static void main(String[] args) {
    oddorEven(3);
    oddorEven(4);
    }
}

