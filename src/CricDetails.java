import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricDetails {
public static List<Cricket> getDetails(){
	Cricket c1=new Cricket(20,"Ashwin",Arrays.asList("TN","AP"),"CSk",120.50);
	Cricket c2=new Cricket(22,"Kohli",Arrays.asList("KR","TN"),"Rcb",140.50);
	Cricket c3=new Cricket(25,"Rohit",Arrays.asList("MH","DL"),"Mi",130.20);
	Cricket c4=new Cricket(30,"Dhawan",Arrays.asList("GL","DL"),"Srh",125.10);
	Cricket c5=new Cricket(24,"Gautam",Arrays.asList("UP","GL"),"Kkr",150.10);
	List<Cricket> l=new ArrayList<Cricket>();
	l.addAll(Arrays.asList(c1,c2,c3,c4,c5));
	return l;
}
}
