import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PlayTest {
public static List<PlayfulPet> check()
{
	List<PlayfulPet> l=new ArrayList<PlayfulPet>();
	PlayfulPet p1=new PlayfulPet("Scruffy","Dog","Poodle","White",18950.00);
	PlayfulPet p2=new PlayfulPet("Tom","Cat","Siamese","Black",7402.75);
	PlayfulPet p3=new PlayfulPet("Max","Dog","Poodle","Brown",17541.99);
	PlayfulPet p4=new PlayfulPet("Cuddles","Dog","Pug","Black",10000.00);
	PlayfulPet p5=new PlayfulPet("Trevor","Bird","Macaws","Red",6777.25);
	PlayfulPet p6=new PlayfulPet("Leo","Bird","Parakeets","Blue",7896.35);
	PlayfulPet p7=new PlayfulPet("Tweety","Bird","Canaries","Yellow",12000.00);
	l.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
	return l;
	
}
}
