public class Dog {
	 int age= 22;
	public Dog (String name){
		System.out.println ("the name of my puppy is" + name);
	}
	 public Dog (int age) {
	 	System.out.println ("the age of my puppy is" + age);age= this.age;

	}

	public static void main(String args[]){
		Student myStudent = new Student();
		int myAge = myStudent.age();

		System.out.println("Your age is : " + myAge);

	}




}
