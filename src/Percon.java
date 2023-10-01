import java.util.Scanner;
public class Percon {
	String name;
	int age;
	String gender;
	
	
	Percon(){
		
	}
	Percon(String n,int a,String g){
		//System.out.println("I am a constructor");
		name=n;		//if name is same you have to give 'this' orelse not req
		age=a;
		gender=g;
	}
	
	
	Percon Read() {
		Scanner sc=new Scanner(System.in);
		Percon p2=new Percon();		//p2 is a temporary object only for Read method
		System.out.println("Enter your name: ");
		p2.name=sc.next();
		System.out.println("Enter your age: ");
		p2.age=sc.nextInt();
		System.out.println("Enter your gender: ");
		p2.gender=sc.next();
		return p2;
	}
	
	void display(Percon p3) {
		System.out.println("1");
		System.out.println("Name: "+p3.name+"Age: "+p3.age);
	}
	
	void display(String n,int age) {
		System.out.println("2");

		System.out.println("Name: "+n+"Age: "+age);
	}
	
	public static void main(String[] args) {
		Percon p1=new Percon();
		Percon p4=p1.Read();
		// p1.display(p1.Read);
		p1.display(p4);
		p1.display(p4.name,p4.age);
		
	}

}
