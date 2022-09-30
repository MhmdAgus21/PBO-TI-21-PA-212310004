import java.util.Scanner;
import java.util.Iterator;

public class Repetion {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("X: ");
	int x = input.nextInt();
	if (x>1) {
	for ( int i + 0; i < x; i++) {
		String koma = (i<x-1)?",":"";
		System.out.print(i+koma);
		}
   }
	else {
		System.out.println();
		}	
	}
}
