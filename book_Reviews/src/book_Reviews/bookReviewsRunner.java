package book_Reviews;

public class bookReviewsRunner {

	public static void main(String[] args) {
		Book book = new Book(1, "Harry Potter", "J.K.Rowling");
		book.addReview(new Review(1, "cool book", 10));
		book.addReview(new Review(2, "cool", 9));
		System.out.println(book);
	}
	

}
