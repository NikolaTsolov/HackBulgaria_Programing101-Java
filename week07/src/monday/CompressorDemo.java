package monday;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CompressorDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Compressor.mapAllWord("/home/ivan/javaHackBulgaria/week07/fileToCompress.txt");
		Path path = Paths.get("/home/ivan/javaHackBulgaria/week07/text.compr");
//		try(BufferedReader bfr = new BufferedReader(new FileReader(path.toFile()))){
//			String line;
//			while((line = bfr.readLine()) != null){
//				System.out.println(line);
//			}
//		}
		Compressor.decompress(path.toFile());
	}

}
