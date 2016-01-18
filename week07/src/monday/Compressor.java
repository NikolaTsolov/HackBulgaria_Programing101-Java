package monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;

public class Compressor {
	private static HashMap<String, Integer> mappedWords = new HashMap<>();

	public static void mapAllWord(String inputfilePath) throws FileNotFoundException, IOException {
		Path filePath = Paths.get(inputfilePath);
		Path destFilePath = Paths.get("/home/ivan/javaHackBulgaria/week07/text.compr");
		try (BufferedReader bfr = new BufferedReader(new FileReader(filePath.toFile()));
				BufferedWriter bfw = new BufferedWriter(new FileWriter(destFilePath.toFile()))) {

			String line;
			String[] words = null;
			while ((line = bfr.readLine()) != null) {
				words = line.split(" ");
				int wordIndex = 0;
				for (String word : words) {
					if (!mappedWords.containsKey(word)) {
						mappedWords.put(word, wordIndex);
						wordIndex += 1;
					}
				}
			}
			for (String word : words) {
				bfw.write(" ~" + mappedWords.get(word));
			}
		}
	}

	public static void decompress(File compressedFile) throws FileNotFoundException, IOException {
		try (BufferedReader bfr = new BufferedReader(new FileReader(compressedFile));
				BufferedWriter brw = new BufferedWriter(new FileWriter("decompressed.txt"))) {
			String line;
			String[] items;
			while ((line = bfr.readLine()) != null) {
				line = line.trim();
				items = line.split(" ");
				for (String item : items) {
					item = item.replace("~", "");
					for (Entry<String, Integer> pair : mappedWords.entrySet()) {
						if (Integer.parseInt(item) == pair.getValue()) {
							brw.write(pair.getKey() + " ");
						}
					}
				}
			}
		}
	}
}
