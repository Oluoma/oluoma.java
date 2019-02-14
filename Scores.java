public class Scores { 

	public int a (int x ) {
		if (x>=70 && x<=100)
		System.out.println("Your grade is A.");
		return 0;	
	}

	public int b (int x) {
		if (x>=65 && x<=69)
		System.out.println("Your grade is B.");
		return 0;
	}

	public int c (int x) {
		if (x>=60 && x<=64)
		System.out.println("Your grade is C.");
		return 0;
	}

	public int d (int x) {
		if (x>=55 && x<=59)
		System.out.println("Your grade is D.");
		return 0; 
	}

	public int e (int x) {
		if (x>=45 && x<=54)
		System.out.println("Your grade is E.");
		return 0;
	}

	public int f (int x) {
		if (x>=0 && x<=44)
		System.out.println("Your grade is F.");
		return 0;
	}

	public int invalid (int x) {
		if (x>100 || x<0)
		System.out.println("Invalid Score.");
		return 0;
	}

}
