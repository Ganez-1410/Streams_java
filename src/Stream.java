import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
public class Stream {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(50,75,90,15,10,39);
	l.stream().filter(m->m>15).forEach(e->System.out.println(e));
    //Stream.of('A','B','C','D').findAny().ifPresent(System.out::println);
	List<String> l1=Arrays.asList("1","2","3","4","5","6");
	List<Integer> i=l1.stream().map(s->Integer.valueOf(s)).filter(number->number%2==1).collect(Collectors.toList());
	System.out.println(i);
	}
}
