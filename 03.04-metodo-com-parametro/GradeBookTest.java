import java.util.Scanner;

public class GradeBookTest {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println("Entre com o nome do curso:");
		String courseOfName = input.nextLine();
		System.out.println();
		
		myGradeBook.displayMessage( nameOfCurse);
	}
}