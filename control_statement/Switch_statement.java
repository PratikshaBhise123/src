package control_statement;

public class Switch_statement {
	public static void main(String[] args) {  
		int num = 1;  
		switch (num){  
		case 0:  
		System.out.println("Zero");  
		break;  
		case 1:  
		System.out.println("One");  
		break;  
		default:  
		System.out.println(num);  
		}  
		}  

}


/*The switch statement contains multiple blocks of code 
 *called cases and a single case is executed based on the
 * variable which is being switched
 * 
 * Syntax:
 * switch (expression){  
    case value1:  
     statement1;  
     break;  
    .  
    .  
    .  
    case value-N:  
     statement N;  
     break;  
    default:  
     default statement;  
}  
 * 
 * 
 * 
 * */
