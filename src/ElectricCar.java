
public class ElectricCar extends CAR{
	int battery_size;

	
	void start_engine() {
		System.out.println("Electric motor started");
	}
	
	
	
	public static void main(String [] args) {
		ElectricCar e1=new ElectricCar();
		e1.battery_size=12;
		e1.start_engine();
	}
}
