//added semicolon to the end of import (Andrew Steele 01/10/2023)

//had to add semicolon to the end of import model.Example for program to run (Riley Ahlrichs 1/14/2023)

import model.Example;
import model.Lion;
import model.PolarBear;
import model.Platypus;
import model.Tiger;
import model.Dog;
import model.Monkey;
import model.Example;
import model.Example;
import model.Example;
import model.Squirrel;
import model.Bird;
import model.Cat;
import model.Penguin;
import model.Wolf;
import model.Cow;
import model.Pig;
import model.Fox;

public class AnimalNoises {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		//created a new instance of the object and output the sound it makes
		Platypus frank = new Platypus();
		System.out.println(frank.makeNoise());
		
		Dog Titan = new Dog();
		System.out.println(Titan.makeNoise());

		Lion chad = new Lion();
		System.out.println(chad.makeNoise());

		Bird SomeBirdName = new Bird();
		System.out.println(SomeBirdName.makeNoise());

	
		Dog Jerry = new Dog();
		System.out.println(Jerry.makeNoise());
		
		Monkey Jeremmy = new Monkey();
		System.out.println(Jeremmy.makeNoise());

		Cat jordan = new Cat("Jordan",6,true);
		System.out.println(jordan.getName() + " Age: " + jordan.getAge() + " Is Loved: " + jordan.getIsLoved());
		System.out.println(jordan.getName() + ": " + jordan.speak());
		
		Squirrel squirrel = new Squirrel();
		System.out.println(squirrel.makeNoise());
		Tiger Machli = new Tiger("Machli",250,5);
		System.out.println(Machli.getName() + ": " + Machli.speak());


		
		Wolf Seth = new Wolf("Seth", "Blue", 34);
		System.out.println("Name: " + Seth.getName() + "; Eye Color: " + Seth.getEyeColor() + "; Size/Height(in inches): " + Seth.getSize());
		System.out.println(Seth.toString());
		System.out.println(Seth.speak());
	}


		PolarBear polly = new PolarBear("Artic", "Polly", 10);
		System.out.println(polly.toString());
		System.out.println(polly.speak());

		
		Pig Wilbur = new Pig();
		System.out.println(Wilbur.makeNoise());
		


		
		Penguin bob = new Penguin();
		System.out.println(bob.speak());

		
		Pig Pinky = new Pig();
		System.out.println(Pinky.makeNoise());




		// use non-default constructor Cow(String name, String type, int age, boolean breedStock)
		// to create an instance/object of Cow class
		Cow betsy = new Cow("Betsy", "dairy", 3, true);
		// call speak() method from Cow class to output sound it makes
		System.out.println(betsy.speak());


		//Abby Boggs 1.13.23 - added wolf instance and noise
		Wolf redd = new Wolf("Redd", "forest", "red");
		System.out.println(redd.makeNoise());



		Fox fantasticMr = new Fox();
		System.out.println("Fastastic Mr Fox says: " + fantasticMr.makeNoise());

	}

		//Rosie the Elephant
		Elephant rosie = new Elephant();
		System.out.println("The elephant says \"" + rosie.speak());

		Siamang monk = new Siamang();
		System.out.println(monk.makeNoise());
		
		Gorilla nash = new Gorilla();
		System.out.println(nash.makeNoise());
	}

}
