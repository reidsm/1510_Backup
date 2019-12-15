import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ForbiddenWords {

	private ArrayList<String> arr;
	private Scanner scan;
	
	public ForbiddenWords(String fileName) throws FileNotFoundException {
		arr = new ArrayList<String>();
		scan = new Scanner(new File(fileName));
		
		while (scan.hasNext()) {
			String nextWord = scan.next();
			arr.add(nextWord);
		}
	}
	
	public boolean containsWord(String word) {
		if (arr.contains(word)) {
			return true;
		} else {
			return false;
		}
	}
	
}
