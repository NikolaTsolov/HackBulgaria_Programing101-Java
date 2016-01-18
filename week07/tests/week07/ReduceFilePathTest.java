package week07;

import static org.junit.Assert.*;

import org.junit.Test;

import monday.ReduceFIlePath;

public class ReduceFilePathTest {

	@Test
	public void test() {
		assertEquals("/home/radorado/code/hackbulgaria",
				ReduceFIlePath.rediceFilePath("/home//radorado/code/./hackbulgaria/week0/../"));
	}

}
