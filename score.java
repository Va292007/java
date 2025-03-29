class adm{
	public void elg(float score){
		System.out.println("Eligibility");
	}
}
class ug extends adm{
	public void elg(float score){
		if(score>=60){
			System.out.println("Eligible");
		}
		else{
			System.out.println("Not Eligible");
		}
	}
}
class pg extends adm{
	public void elg(float score){
		if(score>=70){
			System.out.println("Eligible");
		}
		else{
			System.out.println("Not Eligible");
		}
	}
}
class score{
	public static void main(String[] args){
		ug stu1=new ug();
		pg stu2=new pg();
		stu1.elg(85);
		stu2.elg(70);
	}
}	