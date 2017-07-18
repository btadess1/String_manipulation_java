package basics;

/**
 * 
 * @author Bisrat W Tadesse
 * This class demonstrates how the built-in String methods can be used
 * to manipulate Strings. 
 *
 */
public class StringManipulator {
	
	/**
	 * This method returns the specified two strings after making a trim() and
	 * Concatenation operation
	 * @param str1 String
	 * @param str2 String 
	 * @return String
	 */
	public String trimAndConcat(String str1, String str2){
		return str1.trim() + str2.trim();
	}
	
	/**
	 * This method return the index of the first occurrence of a sub-string or
	 * null if the sub-string is not in the String
	 * @param str String
	 * @param sub sub-string
	 * @return index/Integer
	 */
	public Integer getIndexOrNull(String str, String sub){
		if(str.indexOf(sub)< 0)
			return null;
		else
			return str.indexOf(sub);
	}
	
	/**
	 * This method extracts a substring from the first String using beginning and
	 * ending index and concatenates it to the second string, and returns the result
	 * @param str1 String
	 * @param start String 
	 * @param end Integer
	 * @param str2 Integer
	 * @return
	 */
	public String concatSubString(String str1, int start, int end, String str2){
		return str1.substring(start, end) + str2;
	}
	
	
}
