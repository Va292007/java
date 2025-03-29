class cal{
	public int add(int a,int b){
		return a+b;
	}
	
	public double add(double a, double b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
}

class ocal{
	public static void main(String[] args){
		cal c=new cal();
		System.out.println(c.add(2,3));
		System.out.println(c.add(2.5,3.5));
		System.out.println(c.add(2,3,4));
	}
}