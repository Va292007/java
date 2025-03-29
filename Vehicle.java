class Vehicle{
	public void displayInfo(String comp,String model,int price,int seating,boolean petrol){
		
		System.out.println("Details");
	}
}

class car extends Vehicle{
	public void displayInfo(String comp,String model,int price,int seating,boolean petrol){
		System.out.println("Car Details");
		System.out.println("Car company:"+comp);
		System.out.println("Car model:"+model);
		System.out.println("Car seating:"+seating);
		System.out.println("Car price:"+price);
		System.out.println("Petrol:"+petrol);
	}
}

class implement{
	public static void main(String[] args){
		car c=new car();
		c.displayInfo("maruti","1",1000000,5,true);
	}
}