import java.util.function.BiConsumer;

public class Cons2 {
public static void main(String[] args) {
	String[] s=new String[5];
	BiConsumer<String,Integer> b=(str,i)->s[i]=str;
	b.accept("Ganesh",0);
	b.accept("Kavi",3);
	b.accept("Dharsh",4);
	b.accept("Claud",2);
	b.accept("Ananth",1);
	for(int i=0;i<5;i++)
		System.out.println(i+" = "+s[i]);
}
}
