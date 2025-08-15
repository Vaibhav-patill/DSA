
import java.util.ArrayList;

public class PairSum {
    //brute force
    public static boolean pairSum(ArrayList<Integer> arr, int target) {
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i) + arr.get(j) == target){
                    return true; // Pair found
                }
            }
        }

        return false; // No pair found
    }
    //optimal approach
    public static boolean pairSumOptimal(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                return true; // Pair found
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false; // No pair found
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3); 
        arr.add(4);
        arr.add(5);
        int target = 5;
    }
}
