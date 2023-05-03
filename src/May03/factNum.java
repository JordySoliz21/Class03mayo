package May03;
import java.util.Scanner;
public class factNum {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num;
		factor a = new factor();
		System.out.println("Ingrese un numero: ");
		num = tc.nextInt();
		System.out.println("El factorial es: "+a.Fact(num));

	}

}
