package monday;

import java.io.IOException;

public class WordCounterDemo {
	
	public static void main(String[] args) throws IOException {
		WordCount wc = new WordCount("/home/ivan/javaHackBulgaria/someText.txt");
		wc.printInfo();
	}
}
