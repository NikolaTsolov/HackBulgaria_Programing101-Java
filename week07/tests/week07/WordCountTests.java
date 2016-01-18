package week07;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import monday.WordCount;

public class WordCountTests {

	private static WordCount testObj;

	@BeforeClass
	public static void makeObject() throws IOException {
		testObj = new WordCount("/home/ivan/javaHackBulgaria/someText.txt");
	}

	@Test
	public void testWordCount() {
		assertEquals(10, testObj.getWords());
	}

	@Test
	public void testLinesCount() {
		assertEquals(4, testObj.getLines());
	}

	@Test
	public void testCharacterCount() {
		assertEquals(46, testObj.getCharacters());
	}

}
