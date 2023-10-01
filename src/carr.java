public class carr {
	int make;
	String model;
	int year;	
	
	void display() {
		System.out.println("Make: "+make);
		System.out.println("Model: " +model);
		System.out.println("Year: "+year);
	}
	void start() {
		System.out.println("chalri hai");
	}
	carr(){
		System.out.println("I am a Constructor C1");
	}
	
	carr(int make,String model,int year){
		this();
		this.make=make;
		this.model=model;
		this.year=year;
	}

	public static void main(String[] args) {
		carr car1=new carr(12,"Nano",1987);
		car1.make=12;
		car1.model="Audi";
		car1.year=1990;
		car1.display();
		car1.start();
		
		
	}

}
