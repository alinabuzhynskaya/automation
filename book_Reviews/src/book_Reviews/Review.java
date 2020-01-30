package book_Reviews;

public class Review {
	int id;
	String description;
	int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	public String toString() {
		return id + " " + description + " " + rating + " ";
	}
}
