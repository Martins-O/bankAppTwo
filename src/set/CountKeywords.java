package set;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a java source file: ");
		String filename = input.nextLine();

		File file = new File(filename);
		if(file.exists()) {
			System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
		}
		else {
			System.out.println("File " + filename + " does not exist");
		}
	}
	public static int countKeywords(File file) throws FileNotFoundException {
		String[] keywordString = {"abstract", "assert", "boolean",
			"break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "enum",
			"extends", "for", "final", "finally", "float", "goto",
			"if", "implements", "import", "instanceof", "int",
			"interface", "long", "native", "new", "package", "private",
			"protected", "public", "return", "short", "static",
			"strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "try", "void", "volatile",
			"while", "true", "false", "null"};

		Set<String> KeywordSet = new HashSet<>(Arrays.asList(keywordString));
		int count = 0;

		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			String word = scanner.next();
			count++;
		}
		return count;
	}
}
