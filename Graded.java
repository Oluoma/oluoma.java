import java.util.Scanner;


public class Graded {
 	 
	public static void main(String args[]) {
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Score:");
		int x = scan.nextInt();

	Scores myscores = new Scores();

		if (x>=70 && x<=100) {myscores.a(x);}
		if (x>=65 && x<=69) {myscores.b(x);}
		if (x>=60 && x<=64) {myscores.c(x);}
		if (x>=55 && x<=59) {myscores.d(x);}
		if (x>=45 && x<=54) {myscores.e(x);}
		if (x>=0 && x<=44) {myscores.f(x);}
		if (x>=100 && x<0) {myscores.invalid(x);}

	}


}
