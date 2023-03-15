package Inheritace;


class A{  
	 public int a,b;
	 
	 public void display()
	 {
		  a=10;
		  b=20;
		  
	 }
	}  



	public class Single extends A{  
	 int c=0;
	 public int cal()
	 {
		return c=a+b;
	 }
	 public static void main(String args[]){  
	   Single p=new Single();  
	   p.display();
	   System.out.println("Addition is:"+p.cal()); 
	  
	}  
	}  
	
	/* In this, a class inherits the properties from a single class
	 * 
	 * */

