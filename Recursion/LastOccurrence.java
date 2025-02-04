public class LastOccurrence {

    public static int lastOccurrence(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurrence(arr, target, i+1);

        if(isFound==-1 && arr[i]==target){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={1, 3, 5, 7, 7, 7, 9, 11};
        int target=7;
        System.out.println("Last Occurrence of " + target + " is at index " + lastOccurrence(arr, target, 0));
    }
}
