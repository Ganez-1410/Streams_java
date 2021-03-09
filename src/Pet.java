import java.awt.List;
import java.util.function.Consumer;
public class Pet {
private static Consumer<PlayfulPet> c=(b)->System.out.println(b);
public static void printPrice()
{
	java.util.List<PlayfulPet> l=PlayTest.check();
	l.forEach(i->{
		if(i.getPrice()<=8000)
			c.accept(i);
		});	
}
public static void printBreed()
{
    java.util.List<PlayfulPet> l=PlayTest.check();
	l.forEach(i->{
		if(i.getBreed().equalsIgnoreCase("poodle"))
			c.accept(i);
		});	
}
public static void main(String[] args) {
	System.out.println("The Breed is Poodle\n");
	printBreed();
	System.out.println("\nThe cost is Rs.8000 or less\n");
	printPrice();
}
}
