public class CustomerDetails {
	
private int id;
private int age;
private String gender;
private String residence;
private String education;

public CustomerDetails(int id,int age,String gender, String residence,String education)
{ this.id=id;
  this.age=age;
  this.gender=gender;
  this.residence=residence;
  this.education=education;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getResidence() {
	return residence;
}

public void setResidence(String residence) {
	this.residence = residence;
}

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

@Override
public String toString() 
{ return "Customer[id="+id+", age="+age+", gender="+gender+", residence="+residence+", education="+education+"]";

}
	
}