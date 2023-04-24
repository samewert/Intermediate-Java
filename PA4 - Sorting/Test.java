package PA4;

public class Test {

	public static void main(String[] args) {

		System.out.println("*** Palindrome Checker ***\n");
		String[] func1_input = { "racecar", "abracadabra", "malaalam" };
		for (int i = 0; i < func1_input.length; i++) {
			String str = func1_input[i];
			if (StringStuff.isPalindrome(str))
				System.out.println(str + " is a palindrome");
			else
				System.out.println(str + " is not a palindrome");
		}

		System.out.println("\n*** Longest Palindrome Finder ***\n");
		String[] func2_input = { "racecar", "abrbaadarbaabraxy", "malayaalam" };
		for (int i = 0; i < func2_input.length; i++) {
			String str = func2_input[i];
			String longestPalindromeWithin = StringStuff.longestPalindromeWithin(str);
			System.out.printf("Longest palindrome substring of %s is %s%n", str, longestPalindromeWithin);
		} 

		System.out.println("\n*** Digit Existence Checker ***\n");
		String[] func3_input = { "11004569283779", "034677891", "6010__00ab $ %20445987138575",
				"010__00ab $ %20445987138575" };
		for (int i = 0; i < func3_input.length; i++) {
			String str = func3_input[i];
			if (StringStuff.containsAllDigits(str))
				System.out.println(str + " contains all the digits from 0-9");
			else
				System.out.println(str + " does not contain all the digits from 0-9");
		}

		System.out.println("\n*** Replace All ***");
		String[] func5_input_text = { "hello_anotherhello_onemorehello_yetanotherhello_lasthello",
				"hello_anotherhello_onemorehello_nothing", "aaba_abaaba_aaba" };
		String[] func5_input_keys = { "hello", "hello", "aba" };
		String[] func5_input_replace = { "#JUNK$", "#WOW$", "#abaaba$" };
		for (int i = 0; i < func5_input_text.length; i++) {
			System.out.println("\nOriginal String: " + func5_input_text[i]);
			System.out.println("Key: " + func5_input_keys[i]);
			System.out.println("Replace Key: " + func5_input_replace[i]);
			String replaced = StringStuff.replaceAll(func5_input_text[i], func5_input_keys[i], func5_input_replace[i]);
			System.out.printf("Replaced Text: " + replaced);
			System.out.println();
		}

		System.out.println("\n*** Run-Length Encoding ***\n");
		String[] func4_input = { "AAATCTCCGGGAAAATTT", "AAAAATTTGC", "ACGTCTCCTTAA" };
		for (int i = 0; i < func4_input.length; i++) {
			String str = func4_input[i];
			String rle = StringStuff.runLengthEncode(str);
			System.out.printf("Run-length encoding of %s is %s%n", str, rle);
		}
	}
}
