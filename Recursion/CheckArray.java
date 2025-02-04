public class CheckArray {

    public static boolean checksorted(int[] arr,int i){
        if(i==arr.length-1)
            return true;
            
        if(arr[i] > arr[i+1]){
            return false;
        }
         
        return checksorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        System.out.println(checksorted(arr, 0));
    }
}

//first array will be created in main function then main function calls checksorted function and checks the condition and returns true if array is sorted and returns false if array is not sorted