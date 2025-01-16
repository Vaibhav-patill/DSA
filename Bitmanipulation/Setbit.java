public class Setbit {
    public static int setIthbit(int n,int i){
        int bitMask=1<<i;
        return  n|bitMask;
    }
    public static void main(String[] args) {
        System.err.println(setIthbit(14, 2));
    }
}
