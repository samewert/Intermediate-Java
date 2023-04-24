package PA4;

public class StringStuff {
	
	public static final boolean isPalindrome(final String str) {
		String str1 = str.toLowerCase(); //so then if the input string has any capital letters, it can still be a palindrome like Racecar
		for(int i = 0; i < (str1.length() / 2); i++) { 
			if(str1.charAt(i) != str1.charAt(str1.length() - (i+1)))
				return false;	
		}
		return true;
	}
	
	public static final String longestPalindromeWithin(final String str) {
		String longestPali = "";
		for(int i = 0; i < str.length(); i++) {
			for(int j = str.length(); j >= i; j--) {
				String substring = str.substring(i,j);
				if(StringStuff.isPalindrome(substring)) {
					if(substring.length() > longestPali.length()) 
						longestPali = substring;
					break;
				}
			}
		}
		return longestPali;
	}
	
	public static final boolean containsAllDigits(final String str) {
		boolean[] digit = new boolean[10];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 48 && c <= 57) {
				digit[c - 48] = true;
			}
		}
		for(int j = 0; j < 10; j++) {
			if(!digit[j])
				return false;
		}
		return true;
	}
	
//	I don't actually know if this method is that clean and efficient
//	but it got the job done and I didn't have to use any if-statements
//	Feedback on if this method is clean and good practice for coding would be appreciated
	public static final String replaceAll(final String text, final String key, final String replacement) {
		String str1 = text;
		StringBuilder sb = new StringBuilder("");
		int indexStart = text.indexOf(key);
		while(indexStart > -1) {
			String beginSegment = str1.substring(0, indexStart);
			str1 = str1.substring(indexStart + key.length());
			sb.append(beginSegment);
			sb.append(replacement);
			indexStart = str1.indexOf(key);
		}
		sb.append(str1);
		return sb.toString();
	}
	
	public static final String runLengthEncode(final String str) {
		int counter = 1;
		StringBuilder rle = new StringBuilder("");
		for(int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			if(c == str.charAt(i+1))
				counter++;
			else {
				rle.append(c);
				if(counter > 1)
					rle.append(counter);
					counter = 1;
			}
		}
		rle.append(str.charAt(str.length() - 1));
		if(counter > 1)
			rle.append(counter);
		return rle.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
