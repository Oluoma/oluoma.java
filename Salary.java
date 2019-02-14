public class Salary{
	String name= "Mr Uche";
	String designation= "Principal Manager";
	int salary= 100000;

	public static void main (String args[]) {
	
	ComputingSalary myComputingSalary= new ComputingSalary();
	
	int myWages= myComputingSalary.wages();
	
	System.out.println("my total wages is" + myWages);

	}

}
