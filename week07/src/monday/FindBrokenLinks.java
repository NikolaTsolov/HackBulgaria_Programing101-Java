package monday;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindBrokenLinks {

	public static Path findBrokenLinks(Path inputPath) throws IOException {
		if (Files.isSymbolicLink(inputPath)) {
			return Files.readSymbolicLink(inputPath);
		}
		return inputPath;
	}
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/ivan/javaHackBulgaria/week07/fileToCompress.txt");
		System.out.println(findBrokenLinks(path));
	}
}
