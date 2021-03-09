import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

public class Func2 {
public static void main(String[] args) {
	HashMap<String,String> m=new HashMap<String,String>();
	BiFunction<String,String,List<String>> f=(a,b)->{
		m.put(a,b);
//	m.put("cat","feline with nine lives");
//	m.put("rat","rodent with long tail");
//	System.out.println(m);
	List<String> l=new ArrayList(m.keySet());
	System.out.println(l);
	List<String> l1=new ArrayList(m.values());
	System.out.println(l1);
	return l;
	};
	System.out.println(f.apply("cat","feline with nine lives"));
}
}
