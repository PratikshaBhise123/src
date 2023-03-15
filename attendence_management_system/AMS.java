package attendence_management_system;

public class AMS {
	
	int sid,m1,m2,m3,nop,tol;
	float avg,reg,atnd;
	String name;
	
	public AMS(int s,int mrk1,int mrk2,int mrk3,int np)
	{
		sid=s;
		m1=mrk1;
		m2=mrk2;
		m3=mrk3;
		nop=np;
		atnd=280;
		
	}
	public void cal()
	{
		tol=m1+m2+m3;
		avg=(float)tol/3;
		reg=(float)((nop/atnd)*100);
		
		
		
		
		
		
	}
	public void display()
	{
		System.out.println("ID :"+sid);
		System.out.println("Marks1 :"+m1+"  Marks2 :"+m2+"   Marks3 :"+m3);
		System.out.println("Total marks :"+tol);
		System.out.println("Avg marks :"+avg);
		System.out.print("Attendance is:");
		
		if(reg < 40)
		{
			System.out.println("Very less regular");
		}
		else if(reg>40 && reg<60)
		{
			System.out.println(" Regular");
		}
		else {
			System.out.println(" Very Regular");
		}
	}
	

	public static void main(String[] args) {
		
		AMS am=new AMS(1,50,60,80,250);
				am.cal();
				am.display();

	}

}

/*AMS..--(sid,sname,m1,m2,m3,atnd=280,nop,tot?,avg?reg?)
 * */
