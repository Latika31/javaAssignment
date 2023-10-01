public class bookconst {
	String title;
	String author;
	int year;
	
	void display() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Year: "+year);
	}
	
	bookconst(String title,String author,int year){
		this.title=title;
		this.author=author;
		this.year=year;
		
	}
	public static void main(String[] args) {
		bookconst b1=new bookconst("5 point someone","Chethan Bhagat",2010);
		b1.display();
		bookconst b2=new bookconst("Atomic Habits","James Clear",2018);
		b2.display();
	}

}
