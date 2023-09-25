package Com.JAR;

import javax.persistence.*;

@Entity
public class BOOK
{
	@Id
	int BookId;
	String BookName;
	String BookAuthor;
	String BookTitle;
	int price;
	public BOOK(int bookId, String bookName, String bookAuthor, String bookTitle, int price) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookTitle = bookTitle;
		this.price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BOOK [BookId=" + BookId + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookTitle="
				+ BookTitle + ", price=" + price + "]";
	}
	
	
}
