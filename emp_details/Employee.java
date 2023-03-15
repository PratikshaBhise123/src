package emp_details;

public class Employee {
	
	public int eid;
	String name;
	public int hra=0,ta=0,da=0,gross=0,basic;
	
	public Employee(int id,String nm,int bs)
	{
	eid=id;
	name=nm;
	basic=bs;
	
	}
	
	public void cal()
	{
		hra=basic*12/100;
		da=basic*9/100;
		ta=basic*8/100;
		gross=basic+hra+da;
		
	}
	public void display()
	{

		System.out.println("ID :"+eid);
		System.out.println("Name :"+name);
		System.out.println("Basic :"+basic);
		System.out.println("HRA :"+hra);
		System.out.println("DA :"+da);
		System.out.println("TA :"+ta);
		System.out.println("Gross :"+gross);
		
		
		if(gross>2500)
		{
			System.out.println("A");
		}
		else if(gross>=1000 && gross<=2500)
		{
			System.out.println("B");
			
		}
		else
		
		{
			System.out.println("C");
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		Employee e=new Employee(1,"Pratiksha",1000);
		e.cal();
		e.display();sssss
		
	}

}

/*
 * mp details(eid,eName,basic,hra-12%b,ta-8%b,da-9%b,gross?--gross>=25k-A,gross>=10k<25--B,else C)
 * */
