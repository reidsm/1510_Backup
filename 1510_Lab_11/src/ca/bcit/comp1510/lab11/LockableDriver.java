package ca.bcit.comp1510.lab11;
import java.util.Scanner;
public class LockableDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Coin lockableCoin = new Coin();
		
		int sentinel = 1;
		do {
			System.out.println("What do you want to do with the coin?");
			System.out.println("1. Lock the coin.");
			System.out.println("2. Flip the coin.");
			System.out.println("3. Unlock the coin.");
			System.out.println("0. Exit");
			
			int userSelection = scan.nextInt();
			
			switch (userSelection) {
			case 1: 
				coinLock(lockableCoin);
				break;
			case 2:
				lockableCoin.flip();
				System.out.println(lockableCoin);
				break;
			case 3:
				coinUnlock(lockableCoin);
				break;
			default:
			    System.out.println("Adios amigo.");
				sentinel = 0;		
			}		
		} while (sentinel != 0);
		
	}

	private static void coinUnlock(Coin lockableCoin) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a key to unlock the coin");
		int userKey = scan.nextInt();
		lockableCoin.unlock(userKey);
	}

	private static void coinLock(Coin lockableCoin) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a key to lock the coin");
		int userKey = scan.nextInt();
		lockableCoin.setKey(userKey);
		lockableCoin.lock(userKey);
	}
}
