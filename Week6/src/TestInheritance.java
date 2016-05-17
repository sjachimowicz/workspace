//Part 1
public class TestInheritance {

	public static void main(String[] args) {
		Animal myPet = new Animal(12);
		
		System.out.println(myPet);
		
		Dog max = new Dog(34, "Max");
		Dog rover = new Dog(35, "Rover");
		
		if(max.equals(rover)){
			System.out.println("Max and rover are equal");
		} else{
			System.out.println("Max and rover are NOT equal");
		}
		
		max.setName("Maxwell");
		max.setWeight(56);
		
		System.out.println(max);
		
		Cat fluffy = new Cat(12, "Fluffy", true);
		
		System.out.println(fluffy);
		
		Animal pet;
		pet = fluffy;
		System.out.println(pet);
		pet = max;
		System.out.println(pet);
		
		foo(max);
		foo(fluffy);
		foo(myPet);

	}
	
	public static void foo(Animal animal){
		if(animal instanceof Cat){
			System.out.println("In foo: I am a Cat");
		}
		if(animal instanceof Dog){
			System.out.println("In foo: I am a Dog");
		}
		if(animal instanceof Animal){
			System.out.println("In foo: I'm a Animal");
		}
		System.out.println("In foo: " + animal.toString());
	}

}
