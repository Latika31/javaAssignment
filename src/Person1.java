public class Person1 {

	String name;
	carr car1=new carr();

Person1(String name){
	this.name=name;
	
}
void display() {
	System.out.println("Model: "+name);
}
	
	public static void main(String[] args) {
		Person1 p1=new Person1("Latika");	
	//	car car= new car();
	p1.car1.model="Audi";
		p1.display();
		p1.car1.display();
			
	}

}
	