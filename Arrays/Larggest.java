public class Larggest {
 
    public static int getLargest(int num[]){
        // int largest=Integer.MIN_VALUE;// -infinity
        // int smallest=Integer.MAX_VALUE;//+infinity

        // for (int i = 0; i < num.length; i++) {
        //     if (largest<num[i]) {
        //         largest=num[i];
        //     }
        //     if (smallest>num[i]) {
        //         smallest=num[i];
        //     }
        // }
        // System.out.println("smallest value is "+smallest);
        // return largest;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > largest){
                largest=num[i];
            }
        }
        return  largest;

    }
    public static void main(String[] args) {
        int num[]={1,2,6,7,5};
        System.out.println("largest value is "+getLargest(num));

    }
}
