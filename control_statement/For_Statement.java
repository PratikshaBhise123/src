package control_statement;

public class For_Statement {

	public static void main(String[] args) {
		
		int sum = 0;  
		for(int i = 1; i<=10; i++) {  
		sum = sum + i;  
		}  
		System.out.println("The sum of first 10 numbers is " + sum);  
		

	}

}


/*It enables us to initialize the loop variable, check the condition, and increment/decrement
 *in a single line of code
 *Syntax:
 *for(initialization, condition, increment/decrement) {    
     statements    
}    
 * 
 * 
 * */
