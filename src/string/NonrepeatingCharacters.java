package string;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NonrepeatingCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = scan.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char character : string.toCharArray()) {
			map.put(character, map.getOrDefault(character, 0)+1);
		}
		for(char key: map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
		scan.close();
	}

}
