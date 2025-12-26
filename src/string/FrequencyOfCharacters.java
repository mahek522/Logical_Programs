package string;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = scan.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char character : string.toCharArray()) {
			map.put(character,  map.getOrDefault(character, 0)+1);
		}
		System.out.println("Frequency of Characters: ");
		System.out.println(map);
		scan.close();
	}

}
