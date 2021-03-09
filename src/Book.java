import java.util.List;
public class Book {
	  private int id;
	  private String title;
	  private List<String> genres;
	  private String author;
	  private double price;
	public Book(int id, String title, List<String> genres, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.genres = genres;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genres=" + genres + ", author=" + author + ", price=" + price
				+ "]";
	}

  
}
