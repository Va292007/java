class myclass{
	static int count=0;
	final double pi=3.1415;
	myclass(){
		count++;
	}
	void display(){
	System.out.println("The value of pi is: "+ pi);
	}
	public static void main(String[] args){
	myclass obj1=new myclass();
	myclass obj2=new myclass();
	myclass obj3=new myclass();
	int fc=count;
	System.out.println("Total number of objects created is: "+fc);
	obj1.display();
	obj2.display();
	obj3.display();
	}
}
