import java.util.Scanner;
                 public class si{
                  public static void main(String[] args){
                 Scanner input = new Scanner(System.in);
                 System.out.print("Enter principal amount : ");
                 int p = input.nextInt();
                 System.out.print("Enter rate of interest : ");
                 int r = input.nextInt();
                System.out.print("Enter the time period : ");
              int t = input.nextInt();  
              int SI = p*r*t/100;
            System.out.print("The simple Interest is : " + SI);
            input.close();
     }
}
