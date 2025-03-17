public class SwapAlternate {

    public static void swapalternate(int arr[]){
         int n=arr.length;
         for(int i=0;i<n;i+=2){
            if(i+1 < n){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,2};
        int arr2[]={12,13,14,15};
        swapalternate(arr);
        printArray(arr);
        swapalternate(arr2);
        printArray(arr2);
 
        }
    }

