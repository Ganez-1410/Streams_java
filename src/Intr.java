import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Intr {
public static void main(String[] args) {
//	Predicate<Integer> p=(n)->n%2==0;
//	int[] a= {55,23,78,233,66,99,11};
//	for(int n:a)
//	System.out.println(p.test(n)?n+" is Even":n+" is Odd");
//	System.out.println(Integer.reverseBytes(123));
	List<Integer> l=new ArrayList<Integer>();
	l.add(5);
	l.add(22);
	l.add(98);
	l.add(1);
	l.add(100);
	l.add(33);
	l.add(33);
	System.out.println(l);
	List<Integer> li=l.stream().sorted().collect(Collectors.toList());
	System.out.println(li);
	List<Integer> lis=li.stream().distinct().collect(Collectors.toList());
	System.out.println(lis);
	List<Integer> list=lis.stream().map(m->m+100).collect(Collectors.toList());
	System.out.println(list);
}
}
