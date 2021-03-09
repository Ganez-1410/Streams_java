import java.util.List;
import java.util.function.*;
public class BookConsumer {
  private static BiConsumer<String,String> c1=(title,name)->System.out.println(title.toUpperCase()+" By "+name.toUpperCase());
  private static Consumer<Book> c2=b->System.out.println(b);
  public static void printTitleAndNames() {
	  System.out.println("Books title and names\n");
	  List<Book> bookList=BookDetails.getAllBooks();
	  bookList.forEach(b->c1.accept(b.getTitle(),b.getAuthor()));
	  System.out.println();
  }
  public static void printCostlyBooks() {
	  List<Book> bookList=BookDetails.getAllBooks();
	  System.out.println("Costly Books\n");
	  bookList.forEach(b->{
		  if(b.getPrice()>=275)
			  c2.accept(b);
	  });
	  System.out.println();
  }
  public static void printBooksByGenre() {
	  List<Book> bookList=BookDetails.getAllBooks();
	  System.out.println("Books as Action and Adventure\n");
	  bookList.forEach(b->{
		  if(b.getGenres().contains("Action")&&b.getGenres().contains("Adventure"))
			  c2.accept(b);
	  });
	  System.out.println();
  }
  public static void printBooksByAuthor() {
	  List<Book> bookList=BookDetails.getAllBooks();
	  System.out.println("Books by J.K.Rowling\n");
	  bookList.forEach(b->{
		  if(b.getAuthor().equals("J.K.Rowling"))
			  c2.accept(b);
	  });
	  System.out.println();
  }
  public static void main(String[] args) {
	  printTitleAndNames();
	  printCostlyBooks();
	  printBooksByGenre();
	  printBooksByAuthor();
}
}
