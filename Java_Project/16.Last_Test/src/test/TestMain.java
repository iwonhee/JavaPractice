package test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View.login = new Login(sc);
		View.pDisplay = new ProductDisplay(sc);
		View.adminmode = new AdminMode(sc);
		View.usermode = new UserMode(sc);
		View.uDisplay = new UserDisplay(sc);
		View.accountD = new AccountDisplay();
		View.bDisplay = new BoardDisplay();
		
		View.login.display();
		sc.close();
	}//main()
}//class
