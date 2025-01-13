public class Operations {
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);//to clear ith bit we take not operation and then do AND between the number and bitmask
        return n & bitMask;
    }
    public static void main(String[] args) {
        getIthBit(10,2);
        System.out.println(setIthBit(10, 3));
        System.out.println(clearIthBit(10, 3));
    }
}
