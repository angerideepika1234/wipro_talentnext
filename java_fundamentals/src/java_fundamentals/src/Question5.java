package java_fundamentals;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>0) {
			System.out.println("positive number");
			}else if (a<0){
				System.out.println("negative number");
				} else {
					System.out.println("zero");
					}
		}
}

