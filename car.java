class car{
	public String car_color;
	public String car_brand;
	public String fuel_type;
	public int mileage;
	
	car(String color, String brand, String fuel, int mileage){
	this.car_color=color;
	this.car_brand=brand;
	this.fuel_type=fuel;
	this.mileage=mileage;
	}
	void start(){
	System.out.println("Car has Started");
	}
	void stop(){
	System.out.println("Car is Stopped");
	}
	void service(){
	System.out.println("Car is under service");
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
		System.out.println(car1.car_color);
		System.out.println(car3.mileage);
		System.out.println(car4.car_brand);
	}
}

		
	