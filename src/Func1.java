import java.util.ArrayList;
import java.util.function.Function;

public class Func1 {
public static void main(String[] args) {
	Function<Integer,ArrayList<String>> f=(n)->{
		ArrayList<String> arr=new ArrayList<String>();
		String suits[] = {" SPADES", " HEARTS", " CLUBS", " DIAMONDS"};
	    String cards[] = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	    for(int i=0;i<(n/13);i++) {
	    	arr.add(suits[i]+" => ");
	    	for(int j=0;j<(n/4);j++)
	    		arr.add(cards[j]+" ");
	    	arr.add("\n");
	    }
	    return arr;
	};
	//System.out.println(f.apply(52));//Another way
	for(int i=0;i<new ArrayList<String>(f.apply(52)).size();i++)
	   System.out.print(new ArrayList<String>(f.apply(52)).get(i));
}
}
