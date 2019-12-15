import java.util.Arrays;
import java.util.Scanner;
public class ComparePlayers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Player player = new Player("Burrito Jones", "Pizza", 2);
		System.out.println(player);
		Player player2 = new Player("Rick Head", "Pizza", 1);
		Player player3 = new Player("Rick Head", "Pizza", 1);
		Player player4 = new Player("Zeusrophorous", "Olympus", 3);
		
		boolean equalsTest = player2.equals(player3);
		boolean equalsTest2 = player.equals(player2);
		System.out.println(equalsTest);
		System.out.println(equalsTest2);
		
		Player[] arr = {player, player2, player4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		try {
			Player player5 = new Player("", "Pizza", 6);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Player player6 = new Player("Pizza", "", 6);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Player player7 = new Player("Pizza", "Pizza", -6);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Player[] array = new Player[2];
		System.out.println("You need to create two players");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter a name for the " + (i + 1) + " player");
			String nameInput = scan.next();
			System.out.println("Enter a team for the " + (i + 1) + " player");
			String teamInput = scan.next();
			System.out.println("Enter a jersey number for the " + (i + 1) + " player");
			int jerseyNumber = scan.nextInt();
			
			Player temp = new Player(nameInput, teamInput, jerseyNumber);
			array[i] = temp;
		}
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[0].equals(array[1]));
		
	}
}
