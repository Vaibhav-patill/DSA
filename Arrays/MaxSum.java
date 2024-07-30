public class MaxSum {
    public static void maxsubaarays(int num[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                currsum=0;
                for (int k = start; k <=end; k++) {
                    currsum+=num[k];
                }
                System.err.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
        }
        System.err.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxsubaarays(num);
    }
}
