package monday;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FixUnicodeDemo {

	public static void main(String[] args)  {
		Path sourceFilePath = Paths.get("/home/ivan/javaHackBulgaria/corruptedSubs.srt");
		try{
		FixUnicode.fixEncoding(sourceFilePath);
		}catch(IOException e){
			System.out.println("There is some problem with the file. Please check !");
			e.printStackTrace();
		}
	}
}
