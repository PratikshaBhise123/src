package Inheritace;

interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	
	class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
	public class Multiple{
	   public static void main(String args[]) {
	      Animal a = new Animal();
	      a.eat();
	      a.travel();
	   }
	}
	
	
	/*An interface contains variables and methods like a class but the methods in an interface are abstract
	 *by default unlike a class. Multiple inheritance by interface occurs if a class implements
	 *multiple interfaces or also if an interface itself extends multiple interfaces.
	 * 
	 * 
	 * */
	