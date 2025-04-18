public class Exponentiation {

    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//check lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;//right shift by 1
        }
        return ans;
    }

    public static void main(String[] args) {
        
        System.err.println(fastExpo(3, 5));

    }
}
