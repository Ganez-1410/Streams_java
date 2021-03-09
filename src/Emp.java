import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.stream.Stream;
public class Emp {
  private static Employee em[]= {new Employee(101,"Ganesh",50000),new Employee(1,"Kavi",3000),new Employee(12111,"Claud",8000)};
  public static void main(String[] args) {
	  List<Employee> li=Arrays.asList(em);
	  Stream<Employee> s=li.stream();
	  List<Employee> l=Arrays.asList(em);
	  l.stream().forEach(System.out::println);
	  l.stream().map(Employee::getId).distinct().collect(Collectors.toList()).forEach(System.out::println);
	  //l.stream().forEach(System.out::println);
	 l.stream().filter(m->m.getId()>100).collect(Collectors.toList()).forEach(System.out::println);
	Stream<Employee> e=Stream.of(em);
	Stream.of(em[0],em[1],em[2]);
	Stream.iterate(1, a->a*2).limit(10).forEach(System.out::print);
	System.out.println();
	Stream.of('A','B','C','D').findAny().ifPresent(System.out::println);
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	int sum=list.stream().filter(n->n%2==1).map(n->n*n).reduce(0,Integer::sum);
	System.out.println(sum);
	List<String> lis=Arrays.asList("c","ajp","app","c","jp","ds");
	long count=lis.stream().distinct().count();
	System.out.println(count);
} 
}
