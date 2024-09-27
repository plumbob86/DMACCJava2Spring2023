/**
 * @author Isaac Roetman - ijroetman
 * CIS175 - Spring 2023
 * Jan 17, 2023
 */
package model;
public class Gorilla {
	private String habitat;
	private String name;
	private double weight;
	
	public Gorilla() {	//default constructor	
	}
	
	public Gorilla(String habitat, String name, double weight) { //constructor with parameters setting values
		super();
		this.habitat = habitat;
		this.name = name;
		this.weight = weight;
	}

	//getters and setters
	
	public String getHabitat() {
		return habitat; //returns habitat
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat; //sets habitat
	}

	public String getName() {
		return name; //returns name
	}

	public void setName(String name) {
		this.name = name; //sets the name
	}

	
	public double getWeight() {
		return weight; //returns weight
	}

	public void setWeight(double weight) {
		this.weight = weight; //sets the weight
	}
	
	public String makeNoise() {
		return "Ummm-ummm!"; //returns the noise
	}

	@Override
	public String toString() { //override toString method printing the information of the Gorilla
		return "Gorilla [habitat =" + habitat + ", name =" + name + ", weight =" + weight + "lbs]";
	}
}
