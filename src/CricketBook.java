import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CricketBook {
 private static Consumer<Cricket> k1=(b)->System.out.println(b);
 private static BiConsumer<String,String> k2=(name,place)->System.out.println(name+" from "+place+" in IPL");
public void getPlace() {
	List<Cricket> l=CricDetails.getDetails();
	l.forEach(b->{
		if(b.getPlace().contains("L"))
			k1.accept(b);
	});
}
public void getName() {
	List<Cricket> l=CricDetails.getDetails();
	l.forEach(b->{
		k2.accept(b.getName(),b.getIpl());
	});
}
public void getSr() {
	System.out.println("\nPlayers in more than 130 Strike rate\n");
	List<Cricket> l=CricDetails.getDetails();
	l.forEach(b->{
		if(b.getSr()>130)
			k1.accept(b);
	});
}
public void getAge() {
	System.out.println("\nPlayers in more than 22 Age\n");
	List<Cricket> l=CricDetails.getDetails();
	l.forEach(b->{
		if(b.getAge()>22)
			k1.accept(b);
	});
}
public static void main(String[] args) {
	CricketBook c=new CricketBook();
	c.getAge();
	c.getName();
	c.getPlace();
	c.getSr();
}
}
