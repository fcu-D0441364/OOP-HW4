package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner Enter = new Scanner (System.in);
		NissanTiida Tiida = new NissanTiida();
		int num;
		
		num = Enter.nextInt();
		Tiida.tiida(num);
		Enter.close();

	}

}
