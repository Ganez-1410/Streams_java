import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.BaseStream;
public class Notes {
public static void main(String[] args) {
	   int sum=IntStream.rangeClosed(0,100).sum();
	   int i=IntStream.rangeClosed(0, 50).sum();
	System.out.println(sum+" "+i);

	
}
}
