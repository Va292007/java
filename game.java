interface playable{
	abstract void play();
}
class football implements playable{
	public void play(){
		System.out.println("The score is 20");
	}
}
class volleyball implements playable{
	public void play(){
		System.out.println("The score is 25");
	}
}
class basketball implements playable{
	public void play(){
		System.out.println("The score is 15");
	}
}
class game{
	public static void main(String[] args){
		football f=new football();
		volleyball v=new volleyball();
		basketball b=new basketball();
		f.play();
		v.play();
		b.play();
	}
}