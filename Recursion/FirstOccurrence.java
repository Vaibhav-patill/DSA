public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int target,int i) {

        if(i == arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return firstOccurrence(arr, target, i + 1);
    }           

    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;
        System.out.println(firstOccurrence(arr, target, 0));
    }
}
