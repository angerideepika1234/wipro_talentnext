package java_fundamentals;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lastDigitA = a % 10;
		int lastDigitB = b % 10;
		if (lastDigitA == lastDigitB){
			System.out.println("True");
		}else {
		System.out.println("False");
			
		}
		}

}
