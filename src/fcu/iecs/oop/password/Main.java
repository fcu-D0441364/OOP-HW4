package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner Enter = new Scanner (System.in);
		String password;
		int Exit=0;
		PasswordEncorder str = new PasswordEncorder();
		
		while(Exit==0){
			System.out.println("¿é¤J¦r¦ê:");
			password = Enter.next();
			switch(password){
				case "exit" :
					Exit = 1;
					break;
			
				default:
					password = str.encode(password);
					System.out.println(password);
			}
		}
		Enter.close();
	}
}
