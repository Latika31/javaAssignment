
public class person {
	String name;
	String gender;
	int age;
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
	}
//	person(String name,String gender, int age){
//		
//	}
	public static void main(String[] args) {
		person p1=new person();
		p1.name="Latika";
		p1.gender="Female";
		p1.age=22;
		p1.display();	
		
		person p2=new person();
		p2.name="Shruti";
		p2.gender="Female";
		p2.age=22;
		p2.display();
		}
	}
