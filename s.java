class shape{
	public float calarea(float side){
		return side*side;
	}
	public float calarea(float l,float b){
		return l*b;
	}
}
class circle extends shape{
	public double calarea(double r){
		return 3.14*r*r;
	}
}
 class s{
	public static void main(String[] args){
		circle c=new circle();
		System.out.println(c.calarea(4));
	}
} 