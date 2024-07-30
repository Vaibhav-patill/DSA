

public class Strings {
    public static void printLetters(String array){
        for (int i = 0; i < array.length(); i++) {
            System.out.print(array.charAt(i)+" ");
        }System.out.println();
    }


    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String xyz=new String("xyz");//strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name=sc.nextLine();

       // System.out.print(name);

       //Functions in strings
       String firstname="Vaibhav";
       String lastname="patil";

       System.out.print(firstname.length());
       System.out.println("\n"+firstname+ " "+lastname);//joins the string
       System.out.println(firstname.charAt(1));

       printLetters(firstname);

       //Comparison in strings
       String str1="Tony";
       String str2="Tonpy";

       if(str1.equals(str2)){
        System.out.println("equal");
       }else{
        System.out.println("not equal");
       }

       //substring

       String sub="HeloWorld";
       System.out.println(sub.substring(0, 4));

    }
}
