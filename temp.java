import java.util.Scanner;
class temp{
	public static void main(String[] args){
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter temperature in Fahrenheit:");
				double f=scan.nextDouble();
				double c=((f-32)/(1.8));
				System.out.println("Temperature in celsius is"+c);
	}
}
