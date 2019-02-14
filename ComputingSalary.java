public class ComputingSalary{
	static int a= 100000;
	static int w= 150000;
	
	 public static int trans (){
	      int trans=(10*a)/100;
	      return trans;
	
		}
	 public static int housing (){
		int housing=(20*a)/100;
		return housing;
		
		}
	 public static int health (){
		int health=(20*a)/100;
		return health;
		}

	public static int sum() {
	int sum= (trans() + housing() + health());
	return sum;
	}
	
	public static int tax() {
 	int tax=(10*w)/100;
	return tax;
	}
		 
	public static int wages() {
	int wages= (a + sum() - tax());
	return wages;

	}

	public static void main(String[]args){
	System.out.println(sum());
	System.out.println(wages());
	System.out.println(tax());

	}
	
}
