package week1Problems;

import java.util.Scanner;

public class Task37ReduceFilePath {

	public static String reduceFilePath(String path) {
		if(path.charAt(0) != '/'){
			return "Invalid path";
		}
		if (path.equals("/")) {
			return "/";
		}
		String reducedPath = path;
		while (reducedPath.contains("//")) {
			reducedPath = reducedPath.replace("//", "/");
		}
		int index = 0;
		if (reducedPath.contains("..")) {
			index = reducedPath.indexOf("..");
			index -= 2;
			if (index < 0) {
				index = 1;
			}
			while (reducedPath.charAt(index) != '/' && index > 1) {
				index--;
			}
			reducedPath = reducedPath.substring(0, index);
		}
		reducedPath = reducedPath.replace("./", "");
		if (reducedPath.charAt(reducedPath.length() - 1) == '/' && reducedPath.length() > 2) {
			reducedPath = reducedPath.substring(0, reducedPath.length() - 1);
		}
		return reducedPath;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path = sc.nextLine();

		System.out.println(reduceFilePath(path));

		sc.close();
	}

}
