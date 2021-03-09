import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BookDetails {
 public static List<Book> getAllBooks(){
	 List<Book> bookList=new ArrayList<Book>();
	 Book b1=new Book(1001,"The Hobbit",Arrays.asList("Action","Adventure"),"JRR.Tolkien",278);
	 Book b2=new Book(1002,"Harry Potter",Arrays.asList("Fantasy","Adventure"),"J.K.Rowling",210);
	 Book b3=new Book(1003,"The Lord of the Rings",Arrays.asList("Fantasy","Action","Adventure"),"JRR.Tolkien",325);
	 Book b4=new Book(1004,"Sherlock Homes",Arrays.asList("Crime","Detective"),"Arthur conan Doyle",310);
	 Book b5=new Book(1005,"Rapunzel",Arrays.asList("Fairy Tale"),"Brothers Grimm",235);
	 bookList.addAll(Arrays.asList(b1,b2,b3,b4,b5));
	 return bookList;
 }
}
