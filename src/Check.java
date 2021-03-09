@FunctionalInterface
interface Greeting
{
	void perform();
}
public class Check {
public static void main(String[] args) {
	Greeting g=()->System.out.println("Greeting messege..");
	g.perform();
}
}
