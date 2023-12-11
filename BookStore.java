/*
	4a) to record the details of a books sold in a bookStore 
*/
import java.util.*;
public class BookStore {
	private String id;
	private String category;
	private String author;
	private String title;
	private String publisher;
	private double s_price;
	private int qty;
	private static int t_books=0;
	BookStore(String id,String category,String author,String title,String publisher,double price,int qty) {
		this.id=id;
		this.category=category;
		this.author=author;
		this.title=title;
		this.publisher=publisher;
		this.s_price=price;
		this.qty=qty;
		t_books+=qty;
	}
	public String getId() {
		return id;
	}
	public static void trackSalesStatus() {
		System.out.println("Total number of books sold by the store = "+t_books);
	}
	public void display() {
		System.out.println("Book "+id+" is found and available quantity : "+qty);
	}
	public static void main(String[] args) {
		System.out.println("Enter no.of books to be created : ");
		Scanner s=new Scanner(System.in);
		int n,f=0;
		n=s.nextInt();
		String[] id,category,author,title,publisher;
		double[] price;
		int[] qty;
		id=new String[n];
		category=new String[n];
		author=new String[n];
		title=new String[n];
		publisher=new String[n];
		price=new double[n];
		qty=new int[n];
		BookStore b[]=new BookStore[n];
		for(int i=0;i<n;i++) {
			System.out.println("******Enter "+(i+1)+"th Book details******");
			s.nextLine();
			System.out.print("ID : ");
			id[i]=s.nextLine();
			System.out.print("Category : ");
			category[i]=s.nextLine();
			System.out.print("Author : ");
			author[i]=s.nextLine();
			System.out.print("Title : ");
			title[i]=s.nextLine();
			System.out.print("Publisher : ");
			publisher[i]=s.nextLine();
			System.out.print("Price : ");
			price[i]=s.nextDouble();
			System.out.print("Quantity : ");
			qty[i]=s.nextInt();
			b[i]=new BookStore(id[i],category[i],author[i],title[i],publisher[i],price[i],qty[i]);
		}
		trackSalesStatus();
		String sid;
		System.out.println("Enter book ID to get details : ");
		sid=s.next();
		for(int i=0;i<n;i++) {
			if((b[i].getId()).equals(sid)) {
				b[i].display();
				f=1;
				break;
			}
		}
		if (f==0) {
			System.out.println("Entered book "+sid+" is not available");
		}
	}
}