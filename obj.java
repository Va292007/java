class car{
	public String car_color;
	public String car_brand;
	public String fuel_type;
	public int mileage;
	
	car(String car_color, String car_brand, String fuel_type, int mileage){
	this.car_color=car_color;
	this.car_brand=car_brand;
	this.fuel_type=fuel_type;
	this.mileage=mileage;
	}
	void start(){
	System.out.println("Start");
	}
	void stop(){
	System.out.println("Stop");
	}
	void service(){
	System.out.println("service");
	}

	public static void main(String[] args){
		car car1=new car("red","mercedes","diesel",200);
		car car2=new car("blue","audi","petrol",250);
		car car3=new car("green","mercedes","diesel",200);
		car car4=new car("red","mercedes","petrol",150);
		car1.start();
		car2.service();
		car3.stop();
		car4.start();
	}
}

		
	