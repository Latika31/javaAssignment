public class CAR {
	int make;
	String model;
	int year;
	private int _mileage;
	private int _fuel_level;
	int num_cars;
	
	void start_engine() {
		System.out.println("Engine Started");
		System.out.println("Make: "+make);
	}
	void count_num_cars() {
		
	}
	
	public int get_mileage() {
		return _mileage;
	}



	public void set_mileage(int _mileage) {
		this._mileage = _mileage;
	}



	public int get_fuel_level() {
		return _fuel_level;
	}



	public void set_fuel_level(int _fuel_level) {
		this._fuel_level = _fuel_level;
	}



	CAR(){
		System.out.println("This is Const c1");
	}
	
	CAR(int make,String model){
		this();
		this.make=make;
		this.year=year;
		System.out.println("This is Const c2");
		
	}
	CAR(int make,String model,int year){
		this();
		this.make=make;
		this.year=year;
		this.year=year;
		System.out.println("This is Const c3");
		
	}
	
	public static void main(String[] args) {
		CAR c1=new CAR();
		c1.make=98;
		c1.model="BMW";
		c1.year=2012;
		c1.start_engine();
		
		CAR c2=new CAR();
		c2.year=2012;
		c2.model="SUV";
		c2.start_engine();
		
		CAR c3=new CAR(99,"Rolls");
		c3.start_engine();
		CAR c4=new CAR(890,"Harrier",2012);
		c4.start_engine();
		
	}

}
