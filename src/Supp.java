import java.util.function.Supplier;
import java.util.stream.*;
public class Supp {
   public static void main(String args[]) {
       Supplier<String> s=()->Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(t -> t[0]).map(String::valueOf) .collect(Collectors.joining(", "));
	   System.out.println("The Fibonacci series is : "+s.get());
   }
}