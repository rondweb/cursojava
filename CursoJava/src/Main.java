
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("voce digitou string " + x);
		
		double d;
		d = sc.nextDouble();
		System.out.println("voce digitou double " + d);
		
		int i;
		i = sc.nextInt();
		System.out.println("voce digitou integer " + i);
		
		char ch;
		ch = sc.next().charAt(0);
		System.out.println("voce digitou char " + ch);
		
		sc.close(); //tipos de dados
	}

}
