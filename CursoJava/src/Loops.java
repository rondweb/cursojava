import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b ) { 
			System.out.println("a e maior que b");
		}else if(a < b) {
			System.out.println("a e menor que b");
		}
		else {
			System.out.println("a =  b");
		}//
	}

}
