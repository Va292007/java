import java.util.Scanner;
class book{
	public String title;
	public String author;
	public int year;
	book(String title,String author, int year){
		this.title=title;
		this.author=author;
		this.year=year;
	}
	public void display(){
		System.out.println("Title of the book is: "+title);
		System.out.println("Author of the book is: "+author);
		System.out.println("Year of publishion of the book is: "+year);
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of the book:");
		String title=scan.nextLine();
		System.out.println("Enter author of the book:");
		String author=scan.nextLine();
		System.out.println("Enter year of publishion of the book:");
		int year=scan.nextInt();
		book third=new book(title,author,year);
		third.display();
		book first=new book("The mocking bird","Murakami",2005);
		book second=new book("The alchemist","Paulo Coelho",1995);
		first.display();
		second.display();
	}
}