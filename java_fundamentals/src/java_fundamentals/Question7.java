package java_fundamentals;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	}

}
