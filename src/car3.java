public class car3 {
	int year;
	String name;

	void show() {
		System.out.println("Displaying:");
		System.out.println("Year: "+year);
		System.out.println("Name: "+name);
	}
	
	car3(){
		System.out.println("This is Const c1");
	}
	
	car3(int year,String name){
		this();
		this.year=year;
		this.name=name;
		System.out.println("This is Const c2");
		
	}
	public static void main(String[] args) {
		car3 c1=new car3();
		c1.year=1998;
		c1.name="AUDI";
		c1.show();
		
		car3 c2=new car3();
		c2.year=2012;
		c2.name="SUV";
		c2.show();
		
		car3 c3=new car3(1999,"Rolls");
		c3.show();
		car3 c4=new car3(2019,"Harrier");
		c4.show();
		
		

	}

}
