import  java.util.Scanner;

class fib{
	public static void main(String[] args){
		int f1=0;
		int f2=1;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=scan.nextInt();
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2;i<=n;i++){
			sum=f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(f2);
		}
	}
}