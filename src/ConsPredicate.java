import java.util.List;
import java.util.function.Predicate;

public class ConsPredicate {
	public static int hyun=0,hon=0,toyo=0;
	private static Predicate<CustomerDetails> g1=(b) ->b.getGender().equals("female");
	private static Predicate<CustomerDetails> g2=(b) ->b.getGender().equals("male");
	
	private static Predicate<CustomerDetails> r1=(b)->b.getResidence().equals("New York");
	private static Predicate<CustomerDetails> r2=(b)->b.getResidence().equals("New Jersey");
	private static Predicate<CustomerDetails> r3=(b)->b.getResidence().equals("Pennsylvania");


	private static Predicate<CustomerDetails> a1=(b)->b.getAge()>=40&&b.getAge()<=50;
	private static Predicate<CustomerDetails> a2=(b)->b.getAge()>=20&&b.getAge()<=30;
	private static Predicate<CustomerDetails> a3=(b)->b.getAge()>=40;

	
	private static Predicate<CustomerDetails> e1=(b)->b.getEducation().equals("master’s degree");
	private static Predicate<CustomerDetails> e2=(b)->b.getEducation().equals("bachelor’s degree");
	private static Predicate<CustomerDetails> e3=(b)->b.getEducation().equals("PhD");
	
	
   public static void hyundaiElantra()
   { List<CustomerDetails> customerList = CustomerDetails_2.getAllCustomer();
   
   customerList.forEach(b ->{
	
	   if(g1.test(b)&&a1.test(b)&&(r2.test(b)||r3.test(b)&&(e1.test(b)||e2.test(b)||e3.test(b))))
	   {   int id=b.getId();
	       hyun=1;
		   System.out.println("Customer id="+id+" qualifys for Hyundai Elantra");
	   }
   });}

   public static void toyotaPrius()
   { List<CustomerDetails> customerList = CustomerDetails_2.getAllCustomer();
   customerList.forEach(b ->{
	   if(g2.test(b)&&r1.test(b)&&a2.test(b)&&e2.test(b))
	   {   toyo=1;
		   int id=b.getId();
	   System.out.println("Customer id="+id+" qualifys for Toyota Prius");}
   });}

   public static void hondaOdyssey()
   { List<CustomerDetails> customerList = CustomerDetails_2.getAllCustomer();
   customerList.forEach(b ->{
	   if(g1.test(b)&&r2.test(b)&&a3.test(b)&&(e1.test(b)||e3.test(b)))
	   {   int id=b.getId();
	       hon=1;
	   System.out.println("Customer id="+id+" qualifys for Honda Odyssey");}
   
   });}

   public static void main(String[] args)
   { hyundaiElantra();
   toyotaPrius();
   hondaOdyssey();
   if(hyun==0&&toyo==0&&hon==0)
	   System.out.println("All 3 doesn't match fr all cars...");
   else if((hyun==0&&toyo==0&&hon==1)||(hyun==0&&toyo==1&&hon==0)||(hyun==1&&toyo==0&&hon==0))
	   System.out.println("Another 2 details are doesn't match...");
   else if((hyun==0&&toyo==1&&hon==1)||(hyun==1&&toyo==1&&hon==0)||(hyun==1&&toyo==0&&hon==1))
	   System.out.println("Another 1 detail doesn't match...");
   }
   
}
