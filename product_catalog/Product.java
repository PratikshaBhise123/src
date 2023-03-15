package product_catalog;

public class Product {
	int pid,qty,up,stk,tc;
	String pname;
	public Product(int p,String nm,int u,int qt,int st)
	{
		pid=p;
		pname=nm;
		up=u;
		qty=qt;
		stk=st;
		
	}
	public void cal()
	{
		tc=qty*up;	
		
	}
	public void display()
	{
		System.out.println("ID is "+pid);
		System.out.println("Name is "+pname);
		System.out.println("Quantity is "+qty);
		System.out.println("Unit price is "+up);
		System.out.println("Total cost is "+tc);
	}
	

	public static void main(String[] args) {
		
		Product pi=new Product(1,"Pratiksha",10,50,10);
		
		pi.cal();
		pi.display();
		

	}

}


/*
 * Product Catalog (pid,pName,qty,up,stk,tc with remaining stock)*/
