package string;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c,  map.getOrDefault(c, 0)+1);
		}
		System.out.println("Frequency of Characters: ");
		System.out.println(map);
		scan.close();
	}

}
