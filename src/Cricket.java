import java.util.List;
public class Cricket {
	private int age;
    private String name;
    private List<String> place;
    private String ipl;
    private double sr;
    public Cricket(int age, String name, List<String> place, String ipl, double sr) {
		super();
		this.age = age;
		this.name = name;
		this.place = place;
		this.ipl = ipl;
		this.sr = sr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlace(List<String> place) {
		this.place = place;
	}
	public void setIpl(String ipl) {
		this.ipl = ipl;
	}
	public void setSr(double sr) {
		this.sr = sr;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public List<String> getPlace() {
		return place;
	}
	public String getIpl() {
		return ipl;
	}
	public double getSr() {
		return sr;
	}
	@Override
	public String toString() {
		return "Cricket [age=" + age + ", name=" + name + ", place=" + place + ", ipl=" + ipl + ", sr=" + sr + "]";
	}
	
}
