package demo2;
import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In which year were you born");
		
		int y_o_b = sc.nextInt();
		
		System.out.println("You are  " + (2022-y_o_b) + " years old");
		
	}

}
