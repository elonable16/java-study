package hello;
import java.util.Scanner;

class Book1 {
	String title, author;
	public Book1(String title, String authur) {
		this.title = title;
		this.author = authur;
	}
}
public class BookArray {
	public static void main(String[] args) {
		Book1 [] book = new Book1[2];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scan.nextLine();
			System.out.print("저자>>");
			String author = scan.nextLine();
			book[i] = new Book1(title, author);
		}
		for(int i=0; i<book.length; i++) {
			System.out.print("("+ book[i].title + "," + book[i].author + ")");
		}
		scan.close();
	}

}
