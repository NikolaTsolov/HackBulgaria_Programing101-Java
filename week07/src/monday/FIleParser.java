package monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FIleParser {

	public static Map<String, String> readFromPropertiesFile(File file) throws IOException {
		Map<String, String> result = new HashMap<>();
		try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bfr.readLine()) != null) {
				line = line.replaceAll(" ", "");
				int index = line.indexOf("=") + 1;
				if (!line.contains("#")) {
					result.put(line.substring(0, index), line.substring(index, line.length()));

				} else {
					if (line.indexOf("#") > line.indexOf("=")) {
						result.put(line.substring(0, index), line.substring(index, line.indexOf("#")));
					}
				}
			}
			return result;
		}
	}

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/ivan/javaHackBulgaria/Week06/bankAccounts/.properties");
		Map<String, String> result = new HashMap<>();
		result.putAll((readFromPropertiesFile(path.toFile())));
		for (Map.Entry<String, String> item : result.entrySet()) {
			System.out.print(item.getKey() + " ");
			System.out.println(item.getValue());
		}
	}
}
