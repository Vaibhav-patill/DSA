public class ConvertBinary {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int i=0;
        while(n != 0){
            int bit  = n & 1;
            ans = (int) ((bit * Math.pow(10, i)) + ans);

            n = n >> 1;
            i++;
        }

        System.err.println("Binary of 5 is: "+ans);
    }
}
