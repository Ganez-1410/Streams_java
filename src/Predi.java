import java.util.function.IntPredicate;
public class Predi {
public static void main(String[] args) {
	IntPredicate p=n->n%2==0;
	IntPredicate p1=n->n>5;
	int[] in= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Even numbers");
	print(p,in);
	System.out.println("Greater then 5");
	print(p1,in);
	System.out.println("Even nd greater then 5");
	print(p.negate().and(p1),in);
}
public static void print(IntPredicate p,int in[])
{
	for(Integer i:in)
	{
		if(p.test(i))
			System.out.println(i);
	}
}
}
