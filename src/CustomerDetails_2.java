import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDetails_2 {
	public static List<CustomerDetails> getAllCustomer() 
	{ List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
	CustomerDetails c1=new CustomerDetails(1,43,"female","New York","masterís degree");
	CustomerDetails c2=new CustomerDetails(2,45,"male","New York","bachelorís degree");
	CustomerDetails c3=new CustomerDetails(3,52,"female","New York","PhD");

	customerList.addAll(Arrays.asList(c1,c2,c3));

	return customerList;
}
}
