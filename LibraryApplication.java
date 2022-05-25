import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryApplication {

	public static void main(String[] args) throws IOException {

		int noOfBooks = 0;
		List<Book> books = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no.of books you want to enter");
		noOfBooks = Integer.parseInt(br.readLine());
		
		System.out.println("no.of books" + noOfBooks);

		if(noOfBooks <=1000) {
			for (int i = 0; i < noOfBooks; i++) {
				System.out.println("Book name :");
				String bookName = br.readLine();
				System.out.println("Book serial :");
				long serialNumber = Long.parseLong(br.readLine());
				books.add(new Book(bookName, serialNumber));
			}
			Collections.sort(books, new Comparator<Book>(){

				  public int compare(Book b1, Book b2)
				  {
					  if(b1.bookName.equals(b2.bookName)) {
						  return Long.compare(b1.serialNumber,b2.serialNumber);
					  }
				     return b1.bookName.compareTo(b2.bookName);
				  }
				});
			System.out.println("Book orders :");
			books.forEach(t ->System.out.println(t.bookName +":" +t.serialNumber) );
		}else {
			System.out.println("The value you entered exceeded the permitted limit");
		}
	}
}

class Book {
	String bookName;
	long serialNumber;

	Book(String bookName, long serialNumber) {
		this.bookName = bookName;
		this.serialNumber = serialNumber;
	}
}
