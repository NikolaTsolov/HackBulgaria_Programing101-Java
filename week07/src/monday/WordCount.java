package monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
	private int words;
	private int lines;
	private int characters;
	private File myFile;
	private Path path;

	public WordCount(String inputStringPath) throws IOException {
		this.path = Paths.get(inputStringPath);
		this.myFile = fromPathToFile(path);
		this.words = wordCount();
		this.lines = linesCount();
		this.characters = charactersCount();
	}

	private File fromPathToFile(Path path) {
		return path.toFile();
	}

	private int wordCount() throws IOException {
		String[] wordsArr = null;
		String line;
		try (BufferedReader bfr = new BufferedReader(new FileReader(myFile))) {

			while ((line = bfr.readLine()) != null) {
				wordsArr = line.split(" ");
				words += wordsArr.length;
			}
		}
		return words;
	}

	private int linesCount() throws FileNotFoundException, IOException {
		int linesCounter = 0;
		String line;
		try (BufferedReader bfr = new BufferedReader(new FileReader(myFile))) {
			while ((line = bfr.readLine()) != null) {
				linesCounter += 1;
			}
		}
		return linesCounter;
	}

	private int charactersCount() throws FileNotFoundException, IOException {
		int charCounter = 0;
		String line;
		try (BufferedReader bfr = new BufferedReader(new FileReader(myFile))) {
			while ((line = bfr.readLine()) != null) {
				line.replaceAll(" ", "");
				charCounter = charCounter + line.length();
			}
		}
		return charCounter;
	}

	public void printInfo() {
		System.out.println("Words: " + this.words);
		System.out.println("Lines: " + this.lines);
		System.out.println("Characters: " + this.characters);
	}
	public int getWords() {
		return words;
	}
	public int getCharacters() {
		return characters;
	}
	public int getLines() {
		return lines;
	}

}
