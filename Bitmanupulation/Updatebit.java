public class Updatebit {

    public static  int setBit(int n,int i){
        int bitMask=1<<i;
         return n|bitMask;
    }

    public  static  int clearbit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int updateBit(int n,int i,int newbit){
        // if(newbit==0){
        //   return clearbit(n, i);
        // }else{
        //   return setBit(n, i);
        // }
         n=clearbit(n, i);
         int bitMask=newbit<<i;
         return n|bitMask;
        
    }

    public static void main(String[] args) {
        System.out.println(updateBit(10,2, 1));
    }
}
