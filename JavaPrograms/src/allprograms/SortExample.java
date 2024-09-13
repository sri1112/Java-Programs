package allprograms;

public class SortExample {

	public static void main(String[] args) {

		// program to display string from array
		String[] str = { "java", "js", "html" };

		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]);
			System.out.println(str[i].length());
		}

		// program to display first and last charactor of each string in the array
		for (int i = 0; i <= str.length - 1; i++) {
			String s = str[i];
			System.out.println("first :: " + s.charAt(0) + "  " + "last Number :: " + s.charAt(s.length() - 1));
		}
	}

}
