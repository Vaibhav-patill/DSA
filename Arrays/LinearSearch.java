public class LinearSearch {

    public static  int linearsearch(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static int linear_serach(String food[],String key2){
        for (int i = 0; i < food.length; i++) {
            if(food[i].equals(key2)){
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {

    //these is linear search for integer
    int numbers[]={2,4,6,8,10,12,14,16};
    int key=10;

    int index=linearsearch(numbers, key);
    if(index==-1){
        System.out.println("key not found");
    }else{
        System.out.println("key is at index "+index);
    }


    //these is linear search for string
    String food[]={"dosa","samosa","idli","vada","puri  bhaji","chole bhature","pav bhaji"};
    String key2="puri bhaji";

    int index2=linear_serach(food, key2);
    if(index2==-1){
        System.out.println("key not found");
    }else{
        System.out.println("key is at index "+index2);
    }

   } 
}
