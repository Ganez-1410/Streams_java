public class PlayfulPet {
 private String name;
 private String animal;
 private String breed;
 private String color;
 private double price;
 public PlayfulPet(String name,String animal,String breed,String color,double price)
 {
	 this.name=name;
	 this.animal=animal;
	 this.breed=breed;
	 this.color=color;
	 this.price=price;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAnimal() {
	return animal;
}
public void setAnimal(String animal) {
	this.animal = animal;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "PlayfulPet [name=" + name + ", animal=" + animal + ", breed=" + breed + ", color=" + color + ", price="
			+ price + "]";
}
}