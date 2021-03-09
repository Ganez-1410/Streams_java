import java.util.function.BiPredicate;
import java.util.function.Predicate;
public class Pred1 {
public static void main(String[] args) {
	Predicate<Integer> p=n->(n<100);
	Predicate<Integer> p1=n->(n%2==1);
	Predicate<Integer> p2=n->(n>20);
	System.out.println(p.or(p1).negate().and(p2).test(102));
	BiPredicate<Integer,Integer> b=(x,y)->(x>2);
	BiPredicate<Integer,Integer> b1=(x,y)->(y<x);
	System.out.println(b.and(b1).negate().test(3,0));
}
}
