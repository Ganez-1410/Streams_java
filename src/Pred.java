import java.util.ArrayList;
import java.util.function.Predicate;
public class Pred {
public static void main(String[] args) {
	Predicate<String> p=s->s.matches("[0-9]+")&&s.length()>2;
	System.out.println("is 659hj8 contains only digits:"+p.test("659hj8"));
	System.out.println("is 7699098 contains only digits:"+p.test("7699098"));
}
}
