import java.util.Scanner;
            public class fac{
                  public static void main(String[] args){
    	    Scanner input = new Scanner(System.in);
    	    System.out.print("Enter the number n : ");
    	    int n = input.nextInt();
   	    int fac = 1;
 		   for(int i = 2; i<=n;i++){
   	   fac *= i;
              }
        System.out.println( "The factorial of the given number is :" + fac);
        input.close();   
  }
}