import java.util.Scanner;
public class rect {
	int length;
	int width;
	
	int area(){
		System.out.println("Area of rectangle: ");
		return length*width;
	}
	
	public static void main(String[] args) {
		rect r1=new rect();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length & width");
		r1.length=sc.nextInt();
		r1.width=sc.nextInt();
		System.out.println(r1.area());
	}
}