import java.util.Scanner;

public class emp {
	String name;
	int emp_id;
	static int sal;
	int hike;
	
	int amount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hike val:");
		hike=sc.nextInt();
		return hike;
		}
	int salraise() {
		sal=sal+hike;
		return sal;
	}
	emp(String name, int emp_id,int sal){
		this.name=name;
		this.emp_id=emp_id;
		this.sal=sal;
	}
	public static void main(String[] args) {
		
		emp e1=new emp("Latika",123,300000);
		e1.amount();
		e1.salraise();
		System.out.println(sal);
		
	}
}
