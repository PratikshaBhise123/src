package Inheritace;
class A{  
	 public int a;
	 
	 public void display()
	 {
		  a=10;
		
		  
	 }
	} 

class B extends A{  
	 public int b;
	 
	 public void display1()
	 {
		 
		  b=30;
		  
	 }
	} 



	public class Mutilevel extends B{  
	 int c=0;
	 public int cal()
	 {
		return c=a+b;
	 }
	 public static void main(String args[]){  
	   Mutilevel p=new Mutilevel();  
	   p.display();
	   p.display1();
	   System.out.println("Addition is:"+p.cal()); 
	  
	}  
	}  

	
	/*The multi-level inheritance includes the involvement of at least two or more than two classes.
	 *One class inherits the features from a parent class and the newly created sub-class becomes 
	 *the base class for another new class
	 * 
	 * */
