public class book {
			String title;
			String author;
			int pub_year;
	
	void print() {
		System.out.println("Book Details:");
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Publication Year: "+pub_year);
	}
	public static void main(String[] args) {
		book b1=new book();
		b1.title="Ikigai";
		b1.author="Hector";
		b1.pub_year=2012;
		b1.print();
		
		book b2=new book();
		b2.title="Two States";
		b2.author="Chethan Bhagat";
		b2.pub_year=2008;
		b2.print();
		
	}
}
