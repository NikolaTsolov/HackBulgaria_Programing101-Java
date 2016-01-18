package monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FixUnicode {

	public static void fixEncoding(Path path) throws FileNotFoundException, IOException {
		Path destinationPath = Paths.get("/home/ivan/javaHackBulgaria/fixedSubs.srt");
		try (BufferedReader bfr = new BufferedReader(
				new InputStreamReader(new FileInputStream(path.toFile()), "windows-1251"));
				BufferedWriter bfw = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(destinationPath.toFile()), "UTF8"))) {
			String line;
			while ((line = bfr.readLine()) != null) {
				bfw.write(line + "\n");
				System.out.println(line);
			}
		}
	}

}
