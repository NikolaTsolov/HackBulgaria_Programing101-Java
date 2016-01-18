package monday;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;

public class FIleParserTest {
	private static FIleParser fp;
	private static Path path;
	private static File file;

	@BeforeClass
	public static void testMakeFile() {
		path = Paths.get("/home/ivan/javaHackBulgaria/Week06/bankAccounts/.properties");
		fp = new FIleParser();
		file = path.toFile();
	}

	@Test
	public void testReadFromPropertiesFile() throws IOException {

		Map<String, String> testMap = new HashMap<>();

		testMap.put("a1=", "b1");
		testMap.put("a2=", "b2");
		testMap.put("a5=", "b6=b7=b8");
		testMap.put("a6=", "b9");
		testMap.put("a3=", "b3");
		testMap.put("a4=", "b4");
		testMap.put("a7=", "=b10");
		assertEquals(testMap, fp.readFromPropertiesFile(file));
	}
}
