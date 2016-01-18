package monday;

import java.nio.file.Paths;

public class ReduceFIlePath {
	
	public static String rediceFilePath(String filePath){
		return Paths.get(filePath).normalize().toString();
	}
	
	public static void main(String[] args)  {
		System.out.println(rediceFilePath("/home//radorado/code/./hackbulgaria/week0/../"));
	}

}
