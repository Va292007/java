interface shape{
	
	abstract void pmeter();
}
class triangle implements shape{
	int s1,s2,s3;
	int p;
	triangle(int s1,int s2,int s3){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	
	public void pmeter(){
		p=s1+s2+s3;
		System.out.println("Perimeter is"+p);
	}
}
class rectangle implements shape{
	int l,b;
	int p;
	rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	public void pmeter(){
		p=2*(l+b);
		System.out.println("Perimeter is"+p);
	}
}
class circle implements shape{
	int r;
	double p;
	circle(int r){
		this.r=r;
	}
	
	public void pmeter(){
		p=2*Math.PI*r;
		System.out.println("Perimeter is "+p);
	}
}
class oshape{
	public static void main(String[] args){
		triangle t=new triangle(1,2,3);
		rectangle r=new rectangle(2,2);
		circle c=new circle(2);
		t.pmeter();
		r.pmeter();
		c.pmeter();
	}
}