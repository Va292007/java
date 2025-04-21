interface login{
	
	abstract void check(String pass,String uname);
}
class portal implements login{
	
	public void check(String pass,String uname){
		if(pass.equals("123")&& uname.equals("hi")){
			System.out.println("Successful");
		}
		else{
			System.out.println("Invalid Credentials");
		}
	}
}
class uni{
	public static void main(String[] args){
		portal p=new portal();
		p.check("123","hi");
		p.check("123","123");
	}
}