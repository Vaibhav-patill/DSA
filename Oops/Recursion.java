public class Recursion {
    
    //print number 10 to 1 in decreasing
    public static void  printDec(int n){
         if(n==1){
            System.out.println(n);
            return; //after the execution of best case it will return and their wil no further process 
         }
         System.out.print(n+" ");
         printDec(n-1);
    }

     
    //print number 1 to 10 in increasing
    public static void printInc(int n){
        if(n==1){
           System.out.print(n+" ");
           return; //after the execution of best case it will return and their wil no further process 
        }
        printInc(n-1);
        System.out.print(n+" ");
         
   }
    
    //factorial of a number
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
              
        int fm1=factorial(n-1);
        int fn=n * fm1;
        return fn;

   }

    //sum of n natuaral numbers
    public static int sum(int n){
        if(n==1){
           return 1;
        }
          
        int sm1=sum(n-1);
        int Sum=n + sm1;
        return Sum;

    }


    //print nth fibonacci number
    public static int Fibonacci(int n){
        if(n==0 || n==1){
           return n;
        }
        
        int Fn1=Fibonacci(n-1);  
        int Fn2=Fibonacci(n-2);
        int SumFibonacci=Fn1+Fn2;
        return SumFibonacci;

    }
    
    //check  array is sorted or not
     public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        isSorted(arr, i+1);
     } 
  
    


    public static void main(String[] args) {
       int n= 6;
       //printDec(n);
       // printInc(n);
       System.out.println(sum(n));
       System.out.println(factorial(n));
       System.out.println(Fibonacci(n));
   
    }
}

/*  stack overflow:-situation when the stack is full duw =e to many calls
*/