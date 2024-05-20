package basicJava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepetatingStringChar {

	public static void main(String[] args) {

		String s1 = "helloworld";

		

		/*
		 * LinkedHashMap<String,Long> colectList =
		 * Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity()
		 * ,LinkedHashMap::new,Collectors.counting()));
		 * 
		 * System.out.println(colectList);
		 */

		for (int i = 0; i < s1.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < s1.length(); j++) {

				if (i != j && s1.charAt(i) == s1.charAt(j)) {

					flag = false;
                    break;
				}
			}

			if (flag) {
				System.out.println(s1.charAt(i));
			}
			

		}
	}

}
