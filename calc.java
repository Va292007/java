class calc{

	int x;
	int y;
	int sum;
	int d;
	int m;

	calc(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int add(){
		sum=x+y;
		return sum;
	}
	public int diff(){
		d=x-y;
		return d;
	}
	public int mul(){
		m=x*y;
		return m;
	}
	public static void main(String[] args){
		calc c1=new calc(10,5);
		System.out.println(c1.add());
		System.out.println(c1.diff());
		System.out.println(c1.mul());
	}
}

