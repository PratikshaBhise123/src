package spring_ass;

public class Invoice {
	String name;
	int id;
	int age;
	
	public Invoice(int age)
	{
		super();
		this.age=age;
	}
	



public void disp()
{
	
	System.out.println("You have got name "+name);
	System.out.println("You have got id "+id);
	System.out.println("You have got age"+age);
	}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
