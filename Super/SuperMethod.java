package Super;

class Vehicle
{
	//Declaring variables
	String car_name;
	int model;
	String color;
	//Creating constructor for initialization
	public Vehicle(String car_name, int model, String color) {
		this.car_name = car_name;
		this.model = model;
		this.color = color;
	}
	//Creating method for printing vehicle details
	void vehicleDetails()
	{
		System.out.println("Car Name: "+car_name);
		System.out.println("Car Model: "+model);
		System.out.println("Car color: "+color);
	}	
}
class Car extends Vehicle
{
	//Declaring sub class variables
	double car_price=1300000;
	public Car(String car_name, int model, String color,double car_price)
	{
		//Calling super calling statement
		//we don't need to initialize again for the constructor
		//calling one class constructor in another class constructor
		super(car_name, model, color);
		this.car_price=car_price;
	}
	//sub class method
	void extraVehicleDetails()
	{
		System.out.println("Car price is: "+car_price);
	}		
}
public class SuperMethod 
{
	public static void main(String[] args)
	{
		//creating object for sub class
		Car car=new Car("KIA",2021,"Black",1300000);
		//Invoking/calling both super and sub class methods
		car.vehicleDetails();
		car.extraVehicleDetails();
	}  
}
