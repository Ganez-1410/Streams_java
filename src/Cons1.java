import java.util.function.Consumer;
public class Cons1 {
public static void main(String[] args) {
	int i=5;
	Consumer<Integer> c=n->System.out.println(n);
	Consumer<Integer> c1=n->System.out.println(n+4);
	Consumer<Integer> c2=n->System.out.println(n*7);
	c.andThen(c1).andThen(c2).accept(i);
}
}